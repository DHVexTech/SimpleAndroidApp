package com.example.logtocache

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var log = applicationContext.getSharedPreferences("logins", Context.MODE_PRIVATE);
        if (log.contains("email") && log.contains("password"))
        {
            var intent = Intent(this, SecondActivity::class.java);
            startActivity(intent);
        }
    }

    fun login(view: View)
    {
        var logins = applicationContext.getSharedPreferences("logins", Context.MODE_PRIVATE)
        logins.edit().putString("email", email.text.toString()).apply()
        logins.edit().putString("password", password.text.toString()).apply()
        startActivity(Intent(this, SecondActivity::class.java))
    }




}
