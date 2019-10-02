package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Conversions (

	@SerializedName("pass_attempts") val pass_attempts : Int,
	@SerializedName("pass_successes") val pass_successes : Int,
	@SerializedName("rush_attempts") val rush_attempts : Int,
	@SerializedName("rush_successes") val rush_successes : Int,
	@SerializedName("defense_attempts") val defense_attempts : Int,
	@SerializedName("defense_successes") val defense_successes : Int,
	@SerializedName("turnover_successes") val turnover_successes : Int
)