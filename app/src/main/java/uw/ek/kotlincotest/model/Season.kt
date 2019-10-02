package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName


data class Season (

	@SerializedName("id") val id : String,
	@SerializedName("year") val year : Int,
	@SerializedName("type") val type : String,
	@SerializedName("name") val name : String
)