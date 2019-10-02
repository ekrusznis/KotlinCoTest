package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Kickoffs (

	@SerializedName("endzone") val endzone : Int,
	@SerializedName("inside_20") val inside_20 : Int,
	@SerializedName("return_yards") val return_yards : Int,
	@SerializedName("returned") val returned : Int,
	@SerializedName("touchbacks") val touchbacks : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("out_of_bounds") val out_of_bounds : Int,
	@SerializedName("kickoffs") val kickoffs : Int,
	@SerializedName("onside_attempts") val onside_attempts : Int,
	@SerializedName("onside_successes") val onside_successes : Int,
	@SerializedName("squib_kicks") val squib_kicks : Int
)