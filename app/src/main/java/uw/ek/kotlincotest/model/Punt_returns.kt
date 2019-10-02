package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Punt_returns (

	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("returns") val returns : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("longest") val longest : Int,
	@SerializedName("touchdowns") val touchdowns : Int,
	@SerializedName("longest_touchdown") val longest_touchdown : Int,
	@SerializedName("faircatches") val faircatches : Int
)