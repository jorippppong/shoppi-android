package com.example.shoppi_android.repository.category

import com.example.shoppi_android.model.Category
import com.example.shoppi_android.network.ApiClient
import com.example.shoppi_android.repository.category.CategoryDataSource

class CategoryRemoteDataSource(private val apiClient: ApiClient): CategoryDataSource {


    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}