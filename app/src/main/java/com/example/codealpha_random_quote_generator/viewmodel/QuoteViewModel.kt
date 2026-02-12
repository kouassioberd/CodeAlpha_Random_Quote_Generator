package com.example.codealpha_random_quote_generator.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codealpha_random_quote_generator.data.model.QuoteDto
import com.example.codealpha_random_quote_generator.data.repository.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    private val repository = QuoteRepository()

    private val _quote = MutableStateFlow<QuoteDto?>(null)
    val quote: StateFlow<QuoteDto?> = _quote

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> = _loading

    init {
        getNewQuote()
    }

    fun getNewQuote() {
        viewModelScope.launch {
            try {
                _loading.value = true
                _quote.value = repository.fetchQuote()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                _loading.value = false
            }
        }
    }
}