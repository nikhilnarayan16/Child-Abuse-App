package com.ayushi.childabuse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ChildAbuse : AppCompatActivity() {

    var b1: Button?=null
    var b2: Button?=null
    var b3: Button?=null
    var b4: Button?=null
    var b5: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_abuse)

        b1=findViewById(R.id.Button1)

        b1?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse, PrivateActivity::class.java)
            startActivity(clickIntent)
        })

        b2=findViewById(R.id.Button2)

        b2?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse,TouchActivity::class.java)
            startActivity(clickIntent)
        })

        b3=findViewById(R.id.Button3)

        b3?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse,FamilyActivity::class.java)
            startActivity(clickIntent)
        })

        b4=findViewById(R.id.Button4)

        b4?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse,AbuseActivity::class.java)
            startActivity(clickIntent)
        })

        b5=findViewById(R.id.MoreButton)

        b5?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse,ChildAbuse2Activity::class.java)
            startActivity(clickIntent)
        })
    }


}
