package com.kcb.android.coronatest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_test.setOnClickListener(this)
        button_history.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button_test -> {
                var intent = Intent(this, TestActivity::class.java)
                startActivity(intent)
            }
            R.id.button_history -> {
                Toast.makeText(this, "Oke", Toast.LENGTH_SHORT).show()
            }
        }
    }
}