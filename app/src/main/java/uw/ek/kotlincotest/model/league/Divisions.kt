package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class Divisions (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("alias") val alias : String,
	@SerializedName("teams") val teams : List<Teams>
)