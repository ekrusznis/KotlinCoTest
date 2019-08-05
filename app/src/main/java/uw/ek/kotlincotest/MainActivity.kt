package uw.ek.kotlincotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
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
import uw.ek.kotlincotest.network.RetrofitFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = RetrofitFactory.makeRetrofitService()
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getPosts()
            try {
                withContext(Dispatchers.Main) {
                    if (response.isSuccessful) {
                        response.body()?.let { initRecyclerView(it) }
                    } else {
                        toast("Error network operation failed with ${response.code()}")
                    }
                }
            } catch (e: HttpException) {
                Log.e("REQUEST", "Exception ${e.message}")
            } catch (e: Throwable) {
                Log.e("REQUEST", "Ooops: Something else went wrong")
            }
        }
    }

    private fun initRecyclerView(list: List<Post>) {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = PostAdapter(list, this)
    }
}
