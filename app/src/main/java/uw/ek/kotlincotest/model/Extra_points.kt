package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName


data class Extra_points (

	@SerializedName("kicks") val kicks : Kicks,
	@SerializedName("conversions") val conversions : Conversions
)