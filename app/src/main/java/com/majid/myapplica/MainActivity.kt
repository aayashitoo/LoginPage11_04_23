package com.majid.myapplica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var etName: EditText
    lateinit var tvName: TextView
    lateinit var etPassword: EditText
    lateinit var tvPassword: TextView
    lateinit var etacn: EditText
    lateinit var btnRegister:Button
    lateinit var etmpin: EditText
    lateinit var etifsc: EditText


    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        tvName = findViewById(R.id.tvName)
        etPassword = findViewById(R.id.etPassword)
        tvPassword = findViewById(R.id.tvPassword)
        // etifsc = findViewById(R.id.etifsc)
        //etacn  = findViewById(R.id.etacn)
        // etmpin = findViewById(R.id.etmpin)
        button = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)
//button = findViewById(R.id.btnrgs)
        // var etPassword = etPassword.text

        button.setOnClickListener {
            if (etName.text.toString().isNullOrBlank()) {
                etName.error = "Enter your name"
            } else if (etPassword.text.toString().isNullOrBlank()) {
                etPassword.error = "Enter your password"
                /* System.out.println("button clicked ${etPassword.text.toString()}")*/
            } else if (etPassword.text.toString().length <= 6) {
                etPassword.error = "Password must be 6"
                /* System.out.println("button clicked ${etPassword.text.toString()}")*/
            } else {
                System.out.println("button clicked ${etName.text.toString()}") // string interpolation}*/

                startActivity(Intent(this, Layouts::class.java))
                // startActivity(Intent(this,MainActivity2::class.java))
                System.out.println("button clicked ${etPassword.text.toString()}") // string interpolation}
            }
        }
        btnRegister.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

    }
}