package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Players (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("jersey") val jersey : Int,
	@SerializedName("reference") val reference : String,
	@SerializedName("position") val position : String,
	@SerializedName("sr_id") val sr_id : String,
	@SerializedName("games_played") val games_played : Int,
	@SerializedName("games_started") val games_started : Int,
	@SerializedName("defense") val defense : Defense
)