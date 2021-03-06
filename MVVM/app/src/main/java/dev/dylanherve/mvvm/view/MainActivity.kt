package dev.dylanherve.mvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.dylanherve.mvvm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frag_container, ProductListFragment())
            .commit()
    }

}