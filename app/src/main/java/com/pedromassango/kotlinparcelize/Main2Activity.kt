package com.pedromassango.kotlinparcelize

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //receive the intent
        val user = intent.getParcelableExtra<User>("user")

        // Format user data
        val data = "Username:\n ${user.username} \n Age: ${user.age}"

        // Pass text on textView
        output.text = data
    }
}
