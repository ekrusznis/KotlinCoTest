package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class References (

	@SerializedName("id") val id : String,
	@SerializedName("origin") val origin : String
)