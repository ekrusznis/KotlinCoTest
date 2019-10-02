package uw.ek.kotlincotest
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.anko.toast
import retrofit2.HttpException
import uw.ek.kotlincotest.adapters.PostAdapter
import uw.ek.kotlincotest.model.Post
import uw.ek.kotlincotest.model.SeasonStatsResponse
import uw.ek.kotlincotest.network.RetrofitFactory
import uw.ek.kotlincotest.network.RetrofitService.Companion.API_KEY
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {
    val context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceAway = RetrofitFactory.makeRetrofitService()
        CoroutineScope(Dispatchers.IO).launch {
            val responseAway = serviceAway.getSeasonStats("5fee86ae-74ab-4bdd-8416-42a9dd9964f3", API_KEY)
            if (responseAway.isSuccessful) {
                val serviceHome = RetrofitFactory.makeRetrofitService()
                Thread.sleep(2000)
                CoroutineScope(Dispatchers.IO).launch {
                    val responseHome = serviceHome.getSeasonStats("386bdbf9-9eea-4869-bb9a-274b0bc66e80", API_KEY)
                    if (responseHome.isSuccessful) {
                        val homeList = ArrayList<SeasonStatsResponse>()
                        homeList.add(responseHome.body()!!)
                        val awayList = ArrayList<SeasonStatsResponse>()
                        awayList.add(responseAway.body()!!)
                        runOnUiThread {
                            initRV(homeList, awayList, context)
                        }
                    } else {
//                        toast("Error network operation failed with ${responseHome.code()}")
                    }
                }
            } else {
//                toast("Error network operation failed with ${responseAway.code()}")
            }
        }
    }

    private fun initRV(homeList: ArrayList<SeasonStatsResponse>, awayList: ArrayList<SeasonStatsResponse>, context: Context) {
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = PostAdapter(homeList, awayList, context)
    }
}
