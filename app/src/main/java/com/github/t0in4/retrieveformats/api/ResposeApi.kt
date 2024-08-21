package com.github.t0in4.retrieveformats.api

import com.github.t0in4.retrieveformats.response.Formats
import retrofit2.http.GET

interface ResposeApi {
    @GET("formats")
    suspend fun getFormats(): Formats
}