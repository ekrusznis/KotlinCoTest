package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class Conferences (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("alias") val alias : String,
	@SerializedName("divisions") val divisions : List<Divisions>
)