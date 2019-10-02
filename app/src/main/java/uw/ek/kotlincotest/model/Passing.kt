package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Passing (

	@SerializedName("attempts") val attempts : Int,
	@SerializedName("completions") val completions : Int,
	@SerializedName("cmp_pct") val cmp_pct : Double,
	@SerializedName("interceptions") val interceptions : Int,
	@SerializedName("sack_yards") val sack_yards : Int,
	@SerializedName("rating") val rating : Int,
	@SerializedName("touchdowns") val touchdowns : Int,
	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("sacks") val sacks : Int,
	@SerializedName("longest") val longest : Int,
	@SerializedName("longest_touchdown") val longest_touchdown : Int,
	@SerializedName("air_yards") val air_yards : Int,
	@SerializedName("redzone_attempts") val redzone_attempts : Int,
	@SerializedName("net_yards") val net_yards : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("gross_yards") val gross_yards : Int,
	@SerializedName("throw_aways") val throw_aways : Int,
	@SerializedName("poor_throws") val poor_throws : Int,
	@SerializedName("defended_passes") val defended_passes : Int,
	@SerializedName("dropped_passes") val dropped_passes : Int,
	@SerializedName("spikes") val spikes : Int,
	@SerializedName("blitzes") val blitzes : Int,
	@SerializedName("hurries") val hurries : Int,
	@SerializedName("knockdowns") val knockdowns : Int,
	@SerializedName("pocket_time") val pocket_time : Double,
	@SerializedName("batted_passes") val batted_passes : Int,
	@SerializedName("on_target_throws") val on_target_throws : Int
)