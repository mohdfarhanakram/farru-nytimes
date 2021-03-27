package com.android.farrunytimes.data.repository

import com.android.farrunytimes.domain.model.News
import com.android.farrunytimes.domain.model.NewsInfo
import com.google.gson.Gson
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Mohd Farhan on 27/03/2021.
 */
class FakeRepository : IRepository {

    override suspend fun getPopularNews(section: String, period: String, apiKey: String): NewsInfo {
        return Gson().fromJson(jsonStr,NewsInfo::class.java)
    }


    var jsonStr = "{\n" +
            "  \"status\": \"OK\",\n" +
            "  \"copyright\": \"Copyright (c) 2021 The New York Times Company.  All Rights Reserved.\",\n" +
            "  \"num_results\": 3,\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"uri\": \"nyt://article/6f627c39-b665-5f18-a5c6-e8ab74a25cd6\",\n" +
            "      \"url\": \"https://www.nytimes.com/2021/03/18/business/media/teen-vogue-editor-alexi-mccammond.html\",\n" +
            "      \"id\": 100000007648898,\n" +
            "      \"asset_id\": 100000007648898,\n" +
            "      \"source\": \"New York Times\",\n" +
            "      \"published_date\": \"2021-03-18\",\n" +
            "      \"updated\": \"2021-03-19 11:31:24\",\n" +
            "      \"section\": \"Business\",\n" +
            "      \"subsection\": \"Media\",\n" +
            "      \"nytdsection\": \"business\",\n" +
            "      \"adx_keywords\": \"Discrimination;Appointments and Executive Changes;Race and Ethnicity;Homosexuality and Bisexuality;McCammond, Alexi;Wintour, Anna;Lynch, Roger;Conde Nast Publications Inc;Teen Vogue\",\n" +
            "      \"column\": null,\n" +
            "      \"byline\": \"By Katie Robertson\",\n" +
            "      \"type\": \"Article\",\n" +
            "      \"title\": \"Teen Vogue Editor Resigns After Fury Over Racist Tweets\",\n" +
            "      \"abstract\": \"The hiring of Alexi McCammond, who was supposed to start at the Condé Nast publication next week, drew complaints because of racist and homophobic tweets she had posted a decade ago.\",\n" +
            "      \"media\": [\n" +
            "        {\n" +
            "          \"type\": \"image\",\n" +
            "          \"subtype\": \"photo\",\n" +
            "          \"caption\": \"Alexi McCammond made her name as a political reporter for Axios.\",\n" +
            "          \"copyright\": \"Michael S. Schwartz/Getty Images\",\n" +
            "          \"approved_for_syndication\": 1,\n" +
            "          \"media-metadata\": [\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/19/business/19TeenVogue-print1/18TeenVogue-01sub-thumbStandard.jpg\",\n" +
            "              \"format\": \"Standard Thumbnail\",\n" +
            "              \"height\": 75,\n" +
            "              \"width\": 75\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/19/business/19TeenVogue-print1/18TeenVogue-01sub-mediumThreeByTwo210.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo210\",\n" +
            "              \"height\": 140,\n" +
            "              \"width\": 210\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/19/business/19TeenVogue-print1/18TeenVogue-01sub-mediumThreeByTwo440.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo440\",\n" +
            "              \"height\": 293,\n" +
            "              \"width\": 440\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"eta_id\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"uri\": \"nyt://article/89c4478f-8d00-5b57-ab1e-adc3f3f40d1e\",\n" +
            "      \"url\": \"https://www.nytimes.com/2021/03/23/style/cinnamon-toast-crunch-shrimp.html\",\n" +
            "      \"id\": 100000007670516,\n" +
            "      \"asset_id\": 100000007670516,\n" +
            "      \"source\": \"New York Times\",\n" +
            "      \"published_date\": \"2021-03-23\",\n" +
            "      \"updated\": \"2021-03-24 10:53:22\",\n" +
            "      \"section\": \"Style\",\n" +
            "      \"subsection\": \"\",\n" +
            "      \"nytdsection\": \"style\",\n" +
            "      \"adx_keywords\": \"Shrimp;Cereals;Food Contamination and Poisoning;your-feed-internet-culture;General Mills Inc\",\n" +
            "      \"column\": null,\n" +
            "      \"byline\": \"By Ezra Marcus\",\n" +
            "      \"type\": \"Article\",\n" +
            "      \"title\": \"The Curious Case of the Cinnamon Toast Crunch Box\",\n" +
            "      \"abstract\": \"Crave those crazy … shrimp tails?\",\n" +
            "      \"media\": [\n" +
            "        {\n" +
            "          \"type\": \"image\",\n" +
            "          \"subtype\": \"photo\",\n" +
            "          \"caption\": \"The contents of Jensen Karp’s box of Cinnamon Toast Crunch.\",\n" +
            "          \"copyright\": \"Jensen Karp\",\n" +
            "          \"approved_for_syndication\": 0,\n" +
            "          \"media-metadata\": [\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/23/fashion/23CINNAMON-TOAST-CRUNCH2/23CINNAMON-TOAST-CRUNCH2-thumbStandard.jpg\",\n" +
            "              \"format\": \"Standard Thumbnail\",\n" +
            "              \"height\": 75,\n" +
            "              \"width\": 75\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/23/fashion/23CINNAMON-TOAST-CRUNCH2/23CINNAMON-TOAST-CRUNCH2-mediumThreeByTwo210-v2.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo210\",\n" +
            "              \"height\": 140,\n" +
            "              \"width\": 210\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/23/fashion/23CINNAMON-TOAST-CRUNCH2/23CINNAMON-TOAST-CRUNCH2-mediumThreeByTwo440-v2.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo440\",\n" +
            "              \"height\": 293,\n" +
            "              \"width\": 440\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"eta_id\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"uri\": \"nyt://article/a9e42c70-d161-5c0d-a8c5-46fa37fa0e0b\",\n" +
            "      \"url\": \"https://www.nytimes.com/2021/03/25/business/auto-shop-pennies.html\",\n" +
            "      \"id\": 100000007671920,\n" +
            "      \"asset_id\": 100000007671920,\n" +
            "      \"source\": \"New York Times\",\n" +
            "      \"published_date\": \"2021-03-25\",\n" +
            "      \"updated\": \"2021-03-26 13:08:27\",\n" +
            "      \"section\": \"Business\",\n" +
            "      \"subsection\": \"\",\n" +
            "      \"nytdsection\": \"business\",\n" +
            "      \"adx_keywords\": \"Automobile Service and Charging Stations;Wages and Salaries;Currency;Workplace Hazards and Violations;A OK Walker Luxury Autoworks (Peachtree City, Ga);Peachtree City (Ga)\",\n" +
            "      \"column\": null,\n" +
            "      \"byline\": \"By Heather Murphy\",\n" +
            "      \"type\": \"Article\",\n" +
            "      \"title\": \"A Man Demanded His Final Paycheck. The Auto Shop Delivered 91,500 Greasy Pennies.\",\n" +
            "      \"abstract\": \"It’s not technically illegal to do so, according to the Department of Labor, but that doesn’t make it OK, according to the former employee’s new Instagram fans.\",\n" +
            "      \"media\": [\n" +
            "        {\n" +
            "          \"type\": \"image\",\n" +
            "          \"subtype\": \"photo\",\n" +
            "          \"caption\": \"\",\n" +
            "          \"copyright\": \"Olivia Oxley\",\n" +
            "          \"approved_for_syndication\": 1,\n" +
            "          \"media-metadata\": [\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/24/multimedia/24xp-pennies-04/24xp-pennies-04-thumbStandard.jpg\",\n" +
            "              \"format\": \"Standard Thumbnail\",\n" +
            "              \"height\": 75,\n" +
            "              \"width\": 75\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/24/multimedia/24xp-pennies-04/24xp-pennies-04-mediumThreeByTwo210.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo210\",\n" +
            "              \"height\": 140,\n" +
            "              \"width\": 210\n" +
            "            },\n" +
            "            {\n" +
            "              \"url\": \"https://static01.nyt.com/images/2021/03/24/multimedia/24xp-pennies-04/24xp-pennies-04-mediumThreeByTwo440.jpg\",\n" +
            "              \"format\": \"mediumThreeByTwo440\",\n" +
            "              \"height\": 293,\n" +
            "              \"width\": 440\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ],\n" +
            "      \"eta_id\": 0\n" +
            "    }\n" +
            "  ]\n" +
            "}"
}