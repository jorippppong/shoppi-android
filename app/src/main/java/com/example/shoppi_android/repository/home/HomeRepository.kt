package com.example.shoppi_android.repository.home

import com.example.shoppi_android.model.HomeData
import com.example.shoppi_android.repository.home.HomeAssetDataSource

//원본 데이터 를 받아 오는 코드를 작성한 클래스 를 parameter 로 넣음
class HomeRepository(private val assetDataSource: HomeAssetDataSource) {

    //TODO : 원본 데이터 받아옴 (왜 궅이 이걸 한번 더 하는 거지..?)
    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}