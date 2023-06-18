package com.tufanakcay.androidretrofit2.services

import com.tufanakcay.androidretrofit2.model.JWTData
import com.tufanakcay.androidretrofit2.model.JWTUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DummyService {

    @POST("/auth/login")
    fun login( @Body jwtUser: JWTUser): Call<JWTData>

}