package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Kicks (

	@SerializedName("attempts") val attempts : Int,
	@SerializedName("blocked") val blocked : Int,
	@SerializedName("made") val made : Int
)