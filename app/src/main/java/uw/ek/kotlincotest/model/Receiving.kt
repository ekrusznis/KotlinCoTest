package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Receiving (

	@SerializedName("targets") val targets : Int,
	@SerializedName("receptions") val receptions : Int,
	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("yards") val yards : Int,
	@SerializedName("touchdowns") val touchdowns : Int,
	@SerializedName("yards_after_catch") val yards_after_catch : Int,
	@SerializedName("longest") val longest : Int,
	@SerializedName("longest_touchdown") val longest_touchdown : Int,
	@SerializedName("redzone_targets") val redzone_targets : Int,
	@SerializedName("air_yards") val air_yards : Int,
	@SerializedName("broken_tackles") val broken_tackles : Int,
	@SerializedName("dropped_passes") val dropped_passes : Int,
	@SerializedName("catchable_passes") val catchable_passes : Int,
	@SerializedName("yards_after_contact") val yards_after_contact : Int
)