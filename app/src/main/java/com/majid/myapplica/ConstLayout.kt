package com.majid.myapplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ConstLayout : AppCompatActivity() {
    lateinit var btnDialog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_guide)
        btnDialog = findViewById(R.id.btnDialog)

        btnDialog.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete")
            dialog.setMessage("Are you sure....")
            dialog.setPositiveButton("Yes") { _, _ ->
                System.out.println("Click")
            }
            dialog.setNegativeButton("No") { _, _ ->
            }
            dialog.setNeutralButton("New"){_,_->
            }
            dialog.show()
        }
    }
}