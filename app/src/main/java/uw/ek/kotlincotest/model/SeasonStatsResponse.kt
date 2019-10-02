package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class SeasonStatsResponse (

	@SerializedName("id") val id : String,
	@SerializedName("name") val name : String,
	@SerializedName("market") val market : String,
	@SerializedName("alias") val alias : String,
	@SerializedName("sr_id") val sr_id : String,
	@SerializedName("season") val season : Season,
	@SerializedName("record") val record : Record,
	@SerializedName("opponents") val opponents : Opponents,
	@SerializedName("players") val players : List<Players>,
	@SerializedName("_comment") val _comment : String
)