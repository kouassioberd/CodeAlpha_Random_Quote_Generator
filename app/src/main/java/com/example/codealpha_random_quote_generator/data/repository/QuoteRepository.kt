package com.example.codealpha_random_quote_generator.data.repository

import com.example.codealpha_random_quote_generator.data.model.QuoteDto
import com.example.codealpha_random_quote_generator.data.remote.RetrofitInstance

class QuoteRepository {

    suspend fun fetchQuote(): QuoteDto {
        return RetrofitInstance.api.getRandomQuote().first()
    }
}