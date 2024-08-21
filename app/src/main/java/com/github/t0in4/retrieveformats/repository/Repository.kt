package com.github.t0in4.retrieveformats.repository

import com.github.t0in4.retrieveformats.api.WebService
import com.github.t0in4.retrieveformats.response.Formats

class Repository (
    private val webService: WebService = WebService()
) {
    suspend fun getFormats(): Formats {
        return webService.getFormats()
    }
}