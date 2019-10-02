package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Redzone (

	@SerializedName("attempts") val attempts : Int,
	@SerializedName("successes") val successes : Int,
	@SerializedName("pct") val pct : Double
)