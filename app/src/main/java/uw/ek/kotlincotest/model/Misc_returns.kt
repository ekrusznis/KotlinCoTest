package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Misc_returns (

	@SerializedName("yards") val yards : Int,
	@SerializedName("touchdowns") val touchdowns : Int,
	@SerializedName("longest_touchdown") val longest_touchdown : Int,
	@SerializedName("blk_fg_touchdowns") val blk_fg_touchdowns : Int,
	@SerializedName("blk_punt_touchdowns") val blk_punt_touchdowns : Int,
	@SerializedName("fg_return_touchdowns") val fg_return_touchdowns : Int,
	@SerializedName("ez_rec_touchdowns") val ez_rec_touchdowns : Int,
	@SerializedName("returns") val returns : Int
)