package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Touchdowns (

	@SerializedName("pass") val pass : Int,
	@SerializedName("rush") val rush : Int,
	@SerializedName("total_return") val total_return : Int,
	@SerializedName("total") val total : Int,
	@SerializedName("fumble_return") val fumble_return : Int,
	@SerializedName("int_return") val int_return : Int,
	@SerializedName("kick_return") val kick_return : Int,
	@SerializedName("punt_return") val punt_return : Int,
	@SerializedName("other") val other : Int
)