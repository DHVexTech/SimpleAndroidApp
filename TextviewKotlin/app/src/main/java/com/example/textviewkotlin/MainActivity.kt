package com.example.textviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var editTextValue: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextValue = findViewById(R.id.editText);
        print(editTextValue);
    }

    fun setLayoutToSecondActivity(view: View) {
        val text = editTextValue!!.text.toString();
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, text);
        startActivity(intent);
    }
}