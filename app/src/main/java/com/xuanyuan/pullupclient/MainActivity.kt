package com.xuanyuan.pullupclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnTest).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v!=null){
            startActivity(Intent(this, Test1Activity::class.java))
        }
    }
}