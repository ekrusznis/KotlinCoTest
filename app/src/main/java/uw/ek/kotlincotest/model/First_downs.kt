package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class First_downs (

	@SerializedName("pass") val pass : Int,
	@SerializedName("penalty") val penalty : Int,
	@SerializedName("rush") val rush : Int,
	@SerializedName("total") val total : Int
)