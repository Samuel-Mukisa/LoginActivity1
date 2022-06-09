package com.mukisasamuel.loginactivtiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginbtn = findViewById<Button>(R.id.etlogin)
        loginbtn.setOnClickListener{
            val i = Intent(this, HomeActivity:: class.java)
            startActivity(i)
        }

    }
}