package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Rushing (

	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("attempts") val attempts : Int,
	@SerializedName("touchdowns") val touchdowns : Int,
	@SerializedName("tlost") val tlost : Int,
	@SerializedName("tlost_yards") val tlost_yards : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("longest") val longest : Int,
	@SerializedName("longest_touchdown") val longest_touchdown : Int,
	@SerializedName("redzone_attempts") val redzone_attempts : Int,
	@SerializedName("broken_tackles") val broken_tackles : Int,
	@SerializedName("kneel_downs") val kneel_downs : Int,
	@SerializedName("scrambles") val scrambles : Int,
	@SerializedName("yards_after_contact") val yards_after_contact : Int
)