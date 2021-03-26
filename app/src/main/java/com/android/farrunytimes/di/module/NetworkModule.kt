package com.android.farrunytimes.di.module

import android.util.Log
import com.android.farrunytimes.data.remote.ApiService
import com.android.farrunytimes.data.repository.IRepository
import com.android.farrunytimes.data.repository.Repository
import com.android.farrunytimes.di.qualifier.BaseUrlString
import com.android.farrunytimes.di.scope.ApplicationScope
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *   Created by Mohd Farhan on 25/03/2021.
 */

@Module
class NetworkModule {

    @Provides
    @ApplicationScope
    fun provideRepository(apiService: ApiService): IRepository {
        return Repository(apiService)
    }

    @Provides
    @ApplicationScope
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @ApplicationScope
    fun provideRetrofit(
        client: OkHttpClient,
        gSon: Gson,
        @BaseUrlString baseUrlString: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrlString)
            .addConverterFactory(GsonConverterFactory.create(gSon))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(client)
            .build()
    }

    @Provides
    @ApplicationScope
    fun provideHttpClient(interceptor: HttpLoggingInterceptor) : OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(5, TimeUnit.MINUTES)
            .addInterceptor(interceptor)
            .build()
    }

    @Provides
    @ApplicationScope
    fun provideLoggerInterceptor() : HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor { message ->
            Log.d(
                "NyTimes : ",
                "log: $message"
            )
        }
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return interceptor;
    }

    @Provides
    @ApplicationScope
    fun provideGson() : Gson {
        return GsonBuilder()
            .create()
    }

}