package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class Teams (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("market") val market : String,
	@SerializedName("alias") val alias : String,
	@SerializedName("sr_id") val sr_id : String,
	@SerializedName("references") val references : List<References>,
	@SerializedName("venue") val venue : Venue,
	@SerializedName("franchise") val franchise : Franchise
)