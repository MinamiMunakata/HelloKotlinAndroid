package com.example.minami.hellokotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_box.*

class BoxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_box)

        btn1.setOnClickListener({v -> switch(1) })
        btn2.setOnClickListener({v -> switch(2) })
    }

    private fun switch(btn: Int) {
        if (btn == 1) {
            btn2.visibility = View.VISIBLE
            btn1.visibility = View.INVISIBLE
        } else {
            btn1.visibility = View.VISIBLE
            btn2.visibility = View.INVISIBLE
        }
    }
}

