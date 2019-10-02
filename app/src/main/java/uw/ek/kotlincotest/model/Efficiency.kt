package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Efficiency (

	@SerializedName("goaltogo") val goaltogo : Goaltogo,
	@SerializedName("redzone") val redzone : Redzone,
	@SerializedName("thirddown") val thirddown : Thirddown,
	@SerializedName("fourthdown") val fourthdown : Fourthdown
)