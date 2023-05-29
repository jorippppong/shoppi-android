package com.example.shoppi_android.repository.home

import com.example.shoppi_android.AssetLoader
import com.example.shoppi_android.model.HomeData
import com.google.gson.Gson

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    //interface 구현 : 원본 데이터 요청 하는 코드 작성
    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let{ homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}