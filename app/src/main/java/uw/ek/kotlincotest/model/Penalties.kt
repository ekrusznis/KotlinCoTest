package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName


data class Penalties (

	@SerializedName("penalties") val penalties : Int,
	@SerializedName("yards") val yards : Int
)