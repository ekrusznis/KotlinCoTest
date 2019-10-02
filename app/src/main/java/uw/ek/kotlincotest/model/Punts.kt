package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Punts (

	@SerializedName("attempts") val attempts : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("net_yards") val net_yards : Int,
	@SerializedName("blocked") val blocked : Int,
	@SerializedName("touchbacks") val touchbacks : Int,
	@SerializedName("inside_20") val inside_20 : Int,
	@SerializedName("return_yards") val return_yards : Int,
	@SerializedName("avg_net_yards") val avg_net_yards : Double,
	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("longest") val longest : Int,
	@SerializedName("hang_time") val hang_time : Double,
	@SerializedName("avg_hang_time") val avg_hang_time : Double
)