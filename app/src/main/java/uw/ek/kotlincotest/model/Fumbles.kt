package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Fumbles (

	@SerializedName("fumbles") val fumbles : Int,
	@SerializedName("lost_fumbles") val lost_fumbles : Int,
	@SerializedName("own_rec") val own_rec : Int,
	@SerializedName("own_rec_yards") val own_rec_yards : Int,
	@SerializedName("opp_rec") val opp_rec : Int,
	@SerializedName("opp_rec_yards") val opp_rec_yards : Int,
	@SerializedName("out_of_bounds") val out_of_bounds : Int,
	@SerializedName("forced_fumbles") val forced_fumbles : Int,
	@SerializedName("own_rec_tds") val own_rec_tds : Int,
	@SerializedName("opp_rec_tds") val opp_rec_tds : Int,
	@SerializedName("ez_rec_tds") val ez_rec_tds : Int
)