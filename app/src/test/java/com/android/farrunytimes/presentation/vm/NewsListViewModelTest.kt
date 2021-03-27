package com.android.farrunytimes.presentation.vm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.android.farrunytimes.TestCoroutineRule
import com.android.farrunytimes.data.remote.ApiService
import com.android.farrunytimes.data.repository.FakeRepository
import com.android.farrunytimes.data.repository.Repository
import com.android.farrunytimes.domain.model.NewsInfo
import com.android.farrunytimes.domain.model.NewsRequest
import com.android.farrunytimes.domain.model.Response
import com.android.farrunytimes.domain.usecase.NewsUseCase
import com.bumptech.glide.Glide.init
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.emptyFlow
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by Mohd Farhan on 27/03/2021.
 */

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class NewsListViewModelTest{



    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()


    private lateinit var newsListViewModel: NewsListViewModel
    private lateinit var apiObserver: Observer<Response<Any>>
    private lateinit var newsSizeObserver: Observer<Response<Any>>


    @Before
    fun setUp(){
        MockitoAnnotations.initMocks(this)
        newsListViewModel = NewsListViewModel(NewsUseCase(FakeRepository()))

    }

    @Test
    fun `check Api status OK`(){
        testCoroutineRule.runBlockingTest {

            apiObserver = Observer {
                when(it) {
                    is Response.Success -> {
                        val newsInfo = (it.data as NewsInfo)
                        assertTrue("API STATUS is Fine","OK".equals(newsInfo.status,true))
                    }
                }

            }

            newsListViewModel.liveData.observeForever(apiObserver)
            newsListViewModel.fetchNewsList()
            newsListViewModel.liveData.removeObserver(apiObserver)
        }
    }

    @Test
    fun `check news available in response`(){
        testCoroutineRule.runBlockingTest {

            newsSizeObserver  = Observer {
                when(it) {
                    is Response.Success -> {
                        val newsInfo = (it.data as NewsInfo)
                        assertTrue("API having news list", newsInfo.results.isNotEmpty())
                    }
                }

            }

            newsListViewModel.liveData.observeForever(newsSizeObserver)
            newsListViewModel.fetchNewsList()
            newsListViewModel.liveData.removeObserver(newsSizeObserver)
        }
    }
}