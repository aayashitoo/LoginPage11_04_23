package com.majid.myapplica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    //declare
    lateinit var etname: EditText
    lateinit var tvname: TextView
    lateinit var etpassword : EditText
    lateinit var tvpassword: TextView
    lateinit var etem: EditText
    lateinit var tvem: TextView
    lateinit var etmno: EditText
    lateinit var tvmno: TextView

    lateinit var btnlgn: Button
    lateinit var btnrgs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //initialise
        etname=findViewById(R.id.etName)
        tvname=findViewById(R.id.tvName)
        etpassword=findViewById(R.id.etPassword)
        tvpassword=findViewById(R.id.tvPassword)
        etem=findViewById(R.id.etem)
        tvem=findViewById(R.id.tvem)
        etmno=findViewById(R.id.etmno)
        tvmno=findViewById(R.id.tvmno)
        btnrgs=findViewById(R.id.btnrgs)
        btnlgn=findViewById(R.id.btnlgn)

        btnrgs.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            }
        }
    }