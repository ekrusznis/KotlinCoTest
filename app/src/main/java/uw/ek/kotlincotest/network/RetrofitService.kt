package uw.ek.kotlincotest.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import uw.ek.kotlincotest.model.SeasonStatsResponse
import uw.ek.kotlincotest.model.league.LeagueHeirResponse

interface RetrofitService{
    @GET("nfl/official/trial/v5/en/seasons/2019/REG/teams/{team}/statistics.json")
    suspend fun getSeasonStats(@Path("team")team: String,
                               @Query("api_key")key: String): Response<SeasonStatsResponse>

    @GET("nfl/official/trial/v5/en/league/hierarchy.json")
    suspend fun getLeagueHeir(@Query("api_key")key: String): Response<List<LeagueHeirResponse>>

    companion object{
        const val API_KEY = "8xf9xtt6m9eha3d76hmsknqz"
    }
}
//http://api.sportradar.us/nfl/official/trial/v5/en/
// seasons/2019/REG/teams/
// 97354895-8c77-4fd4-a860-32e62ea7382a/
// statistics.json?
// api_key=8xf9xtt6m9eha3d76hmsknqz