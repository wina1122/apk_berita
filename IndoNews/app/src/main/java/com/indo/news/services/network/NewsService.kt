package com.indo.news.services.network

import com.indo.news.data.model.News
import com.indo.news.utils.constant.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("top-headlines?country=id")
    suspend fun getNewsByCategory(
        @Query("apiKey") apiKey: String = Constants.API_KEY,
        @Query("category") category: String,
        @Query("pageSize") pageSize: Int = Constants.PAGE_SIZE,
        @Query("page") page: Int): News

    @GET("top-headlines?country=id")
    suspend fun getRecommendedNews(
        @Query("apiKey") apiKey: String = Constants.API_KEY,
        @Query("pageSize") pageSize: Int = Constants.RECOMMENDED_SIZE
    ): News
}