package com.example.shoppi_android.repository

import com.example.shoppi_android.model.HomeData

interface HomeDataSource {

    //원본 데이터 요청
    fun getHomeData(): HomeData?


}