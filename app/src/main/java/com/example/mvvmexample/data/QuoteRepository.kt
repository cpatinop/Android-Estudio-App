package com.example.mvvmexample.data

import com.example.mvvmexample.data.network.QuoteService
import com.example.mvvmexample.model.QuoteModel
import com.example.mvvmexample.model.QuoteProvider

class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}