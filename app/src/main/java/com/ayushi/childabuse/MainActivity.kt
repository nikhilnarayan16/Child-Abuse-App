package com.ayushi.childabuse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    var childButton: ImageButton?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        childButton = findViewById(R.id.child)

        childButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ChildAbuse::class.java)
            startActivity(clickIntent)
        })
    }
}
