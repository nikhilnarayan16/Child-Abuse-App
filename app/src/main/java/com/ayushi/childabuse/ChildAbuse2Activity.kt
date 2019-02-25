package com.ayushi.childabuse

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChildAbuse2Activity : AppCompatActivity() {

    var b6: Button?=null
    var b7: Button?=null
    var b8: Button?=null
    var b9: Button?=null
    var about: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_abuse2)

        b6=findViewById(R.id.Button5)

        b6?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse2Activity, AbuseSignActivity::class.java)
            startActivity(clickIntent)
        })

        b7=findViewById(R.id.Button6)

        b7?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse2Activity, StopActivity::class.java)
            startActivity(clickIntent)
        })

        b8=findViewById(R.id.Button7)

        b8?.setOnClickListener({
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:100")
            startActivity(intent)
        })

        b9=findViewById(R.id.Button8)

        b9?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse2Activity, LawsActivity::class.java)
            startActivity(clickIntent)
        })

        about=findViewById(R.id.AboutUs)

        about?.setOnClickListener({
            var clickIntent = Intent(this@ChildAbuse2Activity, AboutUsActivity::class.java)
            startActivity(clickIntent)
        })
    }
}
