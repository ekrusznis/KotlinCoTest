package uw.ek.kotlincotest.model.league

import com.google.gson.annotations.SerializedName

data class LeagueHeirResponse (

	@SerializedName("league") val league : League,
	@SerializedName("conferences") val conferences : List<Conferences>,
	@SerializedName("_comment") val _comment : String
)