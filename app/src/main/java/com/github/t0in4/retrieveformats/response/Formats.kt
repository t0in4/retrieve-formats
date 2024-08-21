package com.github.t0in4.retrieveformats.response

import com.google.gson.annotations.SerializedName

data class Formats (
    @SerializedName("data"   ) var data   : ArrayList<Data> = arrayListOf(),
    //@SerializedName("paging" ) var paging : Paging?         = Paging(),
)

data class Targets (

    @SerializedName("name"        ) var name       : String? = null,
    @SerializedName("credit_cost" ) var creditCost : Int? = null

)

data class Data (

    @SerializedName("name"    ) var name    : String?            = null,
    @SerializedName("targets" ) var targets : ArrayList<Targets> = arrayListOf()

)

data class Paging (

    @SerializedName("total_count" ) var totalCount : Int?    = null,
    @SerializedName("limit"       ) var limit      : Int?    = null,
    @SerializedName("first"       ) var first      : String? = null,
    @SerializedName("last"        ) var last       : String? = null

)
