package com.github.t0in4.retrieveformats.api

import android.util.Log
import com.github.t0in4.retrieveformats.auth.HeaderInterceptor
import com.github.t0in4.retrieveformats.response.Formats
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebService {
    private lateinit var api: ResposeApi


    init {
        try {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.zamzar.com/v1/")
                .client(
                    OkHttpClient.Builder()
                        .addInterceptor(HeaderInterceptor(ApiKey.secret))
                        .build()
                )
                //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            api = retrofit.create(ResposeApi::class.java)
        } catch (e: IllegalStateException) {
            Log.i("WebService", "$e")
        }
    }

    suspend fun getFormats(): Formats {
        return api.getFormats()
    }
}