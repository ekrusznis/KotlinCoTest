package uw.ek.kotlincotest.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.find
import uw.ek.kotlincotest.R
import uw.ek.kotlincotest.model.SeasonStatsResponse

class PostAdapter(val home: List<SeasonStatsResponse>,
                  val away: List<SeasonStatsResponse>,
                  val context: Context
) : RecyclerView.Adapter<PostAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_post, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return home.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val homeList = home[position]
        val awayList = away[position]
        holder.bind(homeList, awayList)
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tv_home_name = itemView.find<TextView>(R.id.tv_home_name)
        private val tv_away_name = itemView.find<TextView>(R.id.tv_away_name)
        private val valueScoreAway = itemView.find<TextView>(R.id.valueScoreAway)
        private val valueScoreHome = itemView.find<TextView>(R.id.valueScoreHome)
        private val pointDiffTV = itemView.find<TextView>(R.id.pointDiffTV)

        fun bind(home: SeasonStatsResponse, away: SeasonStatsResponse) {
            tv_home_name.text = home.name
            valueScoreHome.text = getHomeTeamValue(home).toString()
            tv_away_name.text = away.name
            valueScoreAway.text = getAwayTeamValue(away).toString()
            val totalPointsDiff = getPointDiffAway(away) / 100 - getPointDiffHome(home) /100
            pointDiffTV.text = totalPointsDiff.toString()

        }
        private fun getPointDiffHome(home: SeasonStatsResponse): Int{
            val touchdowns = home.record.touchdowns.total * 6
            val extraPoints = home.record.extra_points.kicks.made
            val twoPointersRush = home.record.extra_points.conversions.rush_successes * 2
            val twoPointersPass = home.record.extra_points.conversions.pass_successes * 2
            val fieldgoals = home.record.field_goals.made * 3
            val gamesplayed = home.record.games_played
            return touchdowns + extraPoints + twoPointersPass + twoPointersRush + fieldgoals / gamesplayed
        }
        private fun getPointDiffAway(away: SeasonStatsResponse): Int{
            val touchdowns = away.record.touchdowns.total * 6
            val extraPoints = away.record.extra_points.kicks.made
            val twoPointersRush = away.record.extra_points.conversions.rush_successes * 2
            val twoPointersPass = away.record.extra_points.conversions.pass_successes * 2
            val fieldgoals = away.record.field_goals.made * 3
            val gamesplayed = away.record.games_played
            return touchdowns + extraPoints + twoPointersPass + twoPointersRush + fieldgoals / gamesplayed
        }

        private fun getHomeTeamValue(home: SeasonStatsResponse): Int {
            val pointsFor = ArrayList<Int>()
            val pointsAgainst = ArrayList<Int>()
            //FOR
            val rushTDs = home.record.rushing.touchdowns
            val recTDs = home.record.receiving.touchdowns
            val yardsRushed = home.record.rushing.yards
            val yardsPassed = home.record.passing.yards
            val specalTeamsTDs = home.record.punt_returns.touchdowns
            val defFF = home.record.defense.forced_fumbles
            val defInt = home.record.defense.interceptions
            val defSacks = home.record.defense.sacks.toInt()
            val fumTDreturns = home.record.touchdowns.fumble_return
            val intTDreturns = home.record.touchdowns.int_return
            val gamesPlayed = home.record.games_played
            val fgMade = home.record.field_goals.made
            pointsFor.add(rushTDs)
            pointsFor.add(recTDs)
            pointsFor.add(fumTDreturns)
            pointsFor.add(intTDreturns)
            pointsFor.add(yardsRushed)
            pointsFor.add(yardsPassed)
            pointsFor.add(specalTeamsTDs)
            pointsFor.add(defFF)
            pointsFor.add(defInt)
            pointsFor.add(defSacks)
            pointsFor.add(fgMade)
            //AGAINST
            val ffGiven = home.opponents.defense.forced_fumbles
            val intGiven = home.opponents.defense.interceptions
            val sacksGiven = home.opponents.defense.sacks.toInt()
            val fumbleTDsGiven = home.opponents.touchdowns.fumble_return
            val intTDsGiven = home.opponents.touchdowns.int_return
            val recTDsGiven = home.opponents.receiving.touchdowns
            val rushTDsGiven = home.opponents.rushing.touchdowns
            val yardsGivenRush = home.opponents.rushing.yards
            val yardsGivenPass = home.opponents.passing.yards
            pointsAgainst.add(ffGiven)
            pointsAgainst.add(intGiven)
            pointsAgainst.add(sacksGiven)
            pointsAgainst.add(fumbleTDsGiven)
            pointsAgainst.add(intTDsGiven)
            pointsAgainst.add(yardsGivenPass)
            pointsAgainst.add(yardsGivenRush)
            pointsAgainst.add(recTDsGiven)
            pointsAgainst.add(rushTDsGiven)
            val totalPointsFor = pointsFor.sum()/1000
            val totalPointsAgainst = pointsAgainst.sum() /1000
            val total = totalPointsFor - totalPointsAgainst
            Log.i("TAG", total.toString())
            return total
        }
        private fun getAwayTeamValue(away: SeasonStatsResponse): Int {
            val pointsFor = ArrayList<Int>()
            val pointsAgainst = ArrayList<Int>()
            //FOR
            val rushTDs = away.record.rushing.touchdowns
            val recTDs = away.record.receiving.touchdowns
            val yardsRushed = away.record.rushing.yards
            val yardsPassed = away.record.passing.yards
            val specalTeamsTDs = away.record.punt_returns.touchdowns
            val defFF = away.record.defense.forced_fumbles
            val defInt = away.record.defense.interceptions
            val defSacks = away.record.defense.sacks.toInt()
            val fumTDreturns = away.record.touchdowns.fumble_return
            val intTDreturns = away.record.touchdowns.int_return
            val gamesPlayed = away.record.games_played
            val fgMade = away.record.field_goals.made
            pointsFor.add(rushTDs)
            pointsFor.add(recTDs)
            pointsFor.add(fumTDreturns)
            pointsFor.add(intTDreturns)
            pointsFor.add(yardsRushed)
            pointsFor.add(yardsPassed)
            pointsFor.add(specalTeamsTDs)
            pointsFor.add(defFF)
            pointsFor.add(defInt)
            pointsFor.add(defSacks)
            pointsFor.add(fgMade)
            //AGAINST
            val ffGiven = away.opponents.defense.forced_fumbles
            val intGiven = away.opponents.defense.interceptions
            val sacksGiven = away.opponents.defense.sacks.toInt()
            val fumbleTDsGiven = away.opponents.touchdowns.fumble_return
            val intTDsGiven = away.opponents.touchdowns.int_return
            val recTDsGiven = away.opponents.receiving.touchdowns
            val rushTDsGiven = away.opponents.rushing.touchdowns
            val yardsGivenRush = away.opponents.rushing.yards
            val yardsGivenPass = away.opponents.passing.yards
            pointsAgainst.add(ffGiven)
            pointsAgainst.add(intGiven)
            pointsAgainst.add(sacksGiven)
            pointsAgainst.add(fumbleTDsGiven)
            pointsAgainst.add(intTDsGiven)
            pointsAgainst.add(yardsGivenPass)
            pointsAgainst.add(yardsGivenRush)
            pointsAgainst.add(recTDsGiven)
            pointsAgainst.add(rushTDsGiven)
            val totalPointsFor = pointsFor.sum()/ 1000
            val totalPointsAgainst = pointsAgainst.sum() /1000
            val total = totalPointsFor - totalPointsAgainst
            Log.i("TAG", total.toString())
            return total
        }
    }
}
