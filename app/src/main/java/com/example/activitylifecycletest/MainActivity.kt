package com.example.activitylifecycletest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            startActivity(
                Intent(this, Second_Activity::class.java)
            )
        }

        Log.i("My Message" , "This is onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("My Message" , "This is onRestart")
    }
    override fun onStart() {
        super.onStart()
        Log.i("My Message" , "This is onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("My Message" , "This is onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("My Message" , "This is onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("My Message" , "This is onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("My Message" , "This is onDestroy")
    }
}