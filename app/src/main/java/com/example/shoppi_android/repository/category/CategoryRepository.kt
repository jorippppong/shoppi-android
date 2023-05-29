package com.example.shoppi_android.repository.category

import com.example.shoppi_android.model.Category
import com.example.shoppi_android.repository.category.CategoryRemoteDataSource

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
){

    suspend fun getCategories():List<Category>{
        return remoteDataSource.getCategories()
    }
}