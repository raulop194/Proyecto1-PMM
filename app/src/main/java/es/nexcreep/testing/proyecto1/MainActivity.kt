package es.nexcreep.testing.proyecto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private val onCreate = 0
    private val onStart = 1
    private val onResume = 2
    private val onPause = 3
    private val onStop = 4
    private val onRestart = 5
    private val onDestroy = 6

    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var editTextB: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("eventWatcher", "onCreate $onCreate")

        editText = findViewById(R.id.edit_text_1)
        editTextB = findViewById(R.id.edit_text_2)
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

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("edit1", editText.text.toString())
        outState.putString("edit2", editTextB.text.toString())

        super.onSaveInstanceState(outState)
        Log.d("eventWatcher", "Saved instance")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        var text = savedInstanceState.getString("edit1")
        if (text != null)
            editText.setText(text)

        text = savedInstanceState.getString("edit2")
        if (text != null)
            editTextB.setText(text)

        Log.d("eventWatcher", "Restored instance")
    }
}