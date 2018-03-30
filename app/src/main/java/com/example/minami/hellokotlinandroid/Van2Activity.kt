package com.example.minami.hellokotlinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_van2.*

class Van2Activity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_van2)

        Van2screen.setOnClickListener({ v -> Toast.makeText(this, "Toast!!", Toast.LENGTH_SHORT).show()})
        button2.setOnClickListener({v -> nextScreen()})
    }

    private fun nextScreen(){
        val intent: Intent = Intent(this, BoxActivity::class.java)
        startActivity(intent)
    }




}
