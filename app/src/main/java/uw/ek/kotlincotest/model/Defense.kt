package uw.ek.kotlincotest.model

import com.google.gson.annotations.SerializedName

data class Defense (

	@SerializedName("tackles") val tackles : Int,
	@SerializedName("assists") val assists : Int,
	@SerializedName("combined") val combined : Int,
	@SerializedName("sacks") val sacks : Double,
	@SerializedName("sack_yards") val sack_yards : Int,
	@SerializedName("interceptions") val interceptions : Int,
	@SerializedName("passes_defended") val passes_defended : Int,
	@SerializedName("forced_fumbles") val forced_fumbles : Int,
	@SerializedName("fumble_recoveries") val fumble_recoveries : Int,
	@SerializedName("qb_hits") val qb_hits : Int,
	@SerializedName("tloss") val tloss : Int,
	@SerializedName("tloss_yards") val tloss_yards : Int,
	@SerializedName("safeties") val safeties : Int,
	@SerializedName("sp_tackles") val sp_tackles : Int,
	@SerializedName("sp_assists") val sp_assists : Int,
	@SerializedName("sp_forced_fumbles") val sp_forced_fumbles : Int,
	@SerializedName("sp_fumble_recoveries") val sp_fumble_recoveries : Int,
	@SerializedName("sp_blocks") val sp_blocks : Int,
	@SerializedName("misc_tackles") val misc_tackles : Int,
	@SerializedName("misc_assists") val misc_assists : Int,
	@SerializedName("misc_forced_fumbles") val misc_forced_fumbles : Int,
	@SerializedName("misc_fumble_recoveries") val misc_fumble_recoveries : Int,
	@SerializedName("def_targets") val def_targets : Int,
	@SerializedName("def_comps") val def_comps : Int,
	@SerializedName("blitzes") val blitzes : Int,
	@SerializedName("hurries") val hurries : Int,
	@SerializedName("knockdowns") val knockdowns : Int,
	@SerializedName("missed_tackles") val missed_tackles : Int,
	@SerializedName("batted_passes") val batted_passes : Int
)