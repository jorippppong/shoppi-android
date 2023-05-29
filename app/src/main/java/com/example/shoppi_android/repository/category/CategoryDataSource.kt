package com.example.shoppi_android.repository.category

import com.example.shoppi_android.model.Category

interface CategoryDataSource {

    suspend fun getCategories():List<Category>
}