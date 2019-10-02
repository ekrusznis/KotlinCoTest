package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class Franchise (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("alias") val alias : String
)