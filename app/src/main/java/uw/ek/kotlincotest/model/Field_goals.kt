package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Field_goals (

	@SerializedName("attempts") val attempts : Int,
	@SerializedName("made") val made : Int,
	@SerializedName("blocked") val blocked : Int,
	@SerializedName("yards") val yards : Int,
	@SerializedName("avg_yards") val avg_yards : Double,
	@SerializedName("longest") val longest : Int
)