package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName


data class Record (

	@SerializedName("games_played") val games_played : Int,
	@SerializedName("touchdowns") val touchdowns : Touchdowns,
	@SerializedName("rushing") val rushing : Rushing,
	@SerializedName("receiving") val receiving : Receiving,
	@SerializedName("punts") val punts : Punts,
	@SerializedName("punt_returns") val punt_returns : Punt_returns,
	@SerializedName("penalties") val penalties : Penalties,
	@SerializedName("passing") val passing : Passing,
	@SerializedName("misc_returns") val misc_returns : Misc_returns,
	@SerializedName("kickoffs") val kickoffs : Kickoffs,
	@SerializedName("kick_returns") val kick_returns : Kick_returns,
	@SerializedName("interceptions") val interceptions : Interceptions,
	@SerializedName("int_returns") val int_returns : Int_returns,
	@SerializedName("fumbles") val fumbles : Fumbles,
	@SerializedName("first_downs") val first_downs : First_downs,
	@SerializedName("field_goals") val field_goals : Field_goals,
	@SerializedName("extra_points") val extra_points : Extra_points,
	@SerializedName("efficiency") val efficiency : Efficiency,
	@SerializedName("defense") val defense : Defense
)