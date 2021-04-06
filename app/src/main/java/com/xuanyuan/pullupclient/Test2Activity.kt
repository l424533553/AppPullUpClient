package com.xuanyuan.pullupclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Test2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        findViewById<Button>(R.id.btnTest).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}