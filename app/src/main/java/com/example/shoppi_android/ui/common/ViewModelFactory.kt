package com.example.shoppi_android.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.shoppi_android.AssetLoader
import com.example.shoppi_android.network.ApiClient
import com.example.shoppi_android.repository.category.CategoryRemoteDataSource
import com.example.shoppi_android.repository.category.CategoryRepository
import com.example.shoppi_android.repository.home.HomeAssetDataSource
import com.example.shoppi_android.repository.home.HomeRepository
import com.example.shoppi_android.ui.category.CategoryViewModel
import com.example.shoppi_android.ui.home.HomeViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val context:Context): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(HomeViewModel::class.java)){
            val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
            HomeViewModel(repository) as T
        }else if(modelClass.isAssignableFrom(CategoryViewModel::class.java)){
            val repository = CategoryRepository(CategoryRemoteDataSource(ApiClient.create()))
            CategoryViewModel(repository) as T
        } else{
            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
        }
    }
}