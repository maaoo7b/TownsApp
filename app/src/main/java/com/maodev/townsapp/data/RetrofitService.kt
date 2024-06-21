package com.maodev.townsapp.data

import com.maodev.townsapp.data.model.RemoteResult
import com.maodev.townsapp.data.model.TownDTO
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitService {

    @POST("DatabaseIE.php")
    suspend fun getTowns(@Body towns: TownDTO):RemoteResult
    //User=etraining&Password=explorandoando2020%&option=municipios
}

object RetrofitServiceFactory {
    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://www.php.engenius.com.co/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}

