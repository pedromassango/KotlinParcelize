package com.pedromassango.kotlinparcelize

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create user object
        val user = User("Pedro Massango", 20)

        val intent = Intent(this, Main2Activity::class.java)
        // Pass User on Intent
        intent.putExtra("user", user)

        // Button click listener
        onNextActivity.setOnClickListener {

            startActivity( intent)
        }
    }
}
