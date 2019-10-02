package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Interceptions (

	@SerializedName("return_yards") val return_yards : Int,
	@SerializedName("returned") val returned : Int,
	@SerializedName("interceptions") val interceptions : Int
)