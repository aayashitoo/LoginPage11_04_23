package com.majid.myapplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Layouts : AppCompatActivity() {
    lateinit var btnpay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)
        btnpay = findViewById(R.id.btnpay)

        btnpay.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            System.out.println("in pay button click")
            alertDialog.setTitle("pay")
            alertDialog.setMessage("Sure to Pay")
            alertDialog.setPositiveButton("yes") { _, _ ->
                System.out.println("click")
            }
            alertDialog.setNegativeButton("no") { _, _ ->

            }
            alertDialog.show()

            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()


        }

    }
}