package com.example.textviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second);
        val textValue = intent.getStringExtra(EXTRA_MESSAGE);
        findViewById<TextView>(R.id.textView)!!.text = textValue;
    }

}