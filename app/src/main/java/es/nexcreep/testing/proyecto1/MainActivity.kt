package es.nexcreep.testing.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val onCreate = 0
    private val onStart = 1
    private val onResume = 2
    private val onPause = 3
    private val onStop = 4
    private val onRestart = 5
    private val onDestroy = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("eventWatcher", "onCreate $onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("eventWatcher", "onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("eventWatcher", "onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("eventWatcher", "onPause $onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("eventWatcher", "onStop $onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("eventWatcher", "onRestart $onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("eventWatcher", "onDestroy $onDestroy")
    }
}