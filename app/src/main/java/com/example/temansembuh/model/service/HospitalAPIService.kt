package com.example.temansembuh.model.service

import com.example.temansembuh.model.data.HospitalModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface HospitalAPIService {
    @GET("hospitals")
    suspend fun getHospital() : List<HospitalModel>

    companion object {
        var apiService: HospitalAPIService? = null
        fun getInstance() : HospitalAPIService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl("https://dekontaminasi.com/api/id/covid19/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(HospitalAPIService::class.java)
            }
            return apiService!!
        }
    }
}