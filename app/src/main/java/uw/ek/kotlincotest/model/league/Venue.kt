package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class Venue (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("city") val city : String,
	@SerializedName("state") val state : String,
	@SerializedName("country") val country : String,
	@SerializedName("zip") val zip : Int,
	@SerializedName("address") val address : String,
	@SerializedName("capacity") val capacity : Int,
	@SerializedName("surface") val surface : String,
	@SerializedName("roof_type") val roof_type : String,
	@SerializedName("sr_id") val sr_id : String
)