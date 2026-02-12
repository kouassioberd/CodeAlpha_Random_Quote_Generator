package com.example.codealpha_random_quote_generator.data.remote

import com.example.codealpha_random_quote_generator.data.model.QuoteDto
import retrofit2.http.GET

interface QuoteApi {
    @GET("api/random")
    suspend fun getRandomQuote(): List<QuoteDto>
}