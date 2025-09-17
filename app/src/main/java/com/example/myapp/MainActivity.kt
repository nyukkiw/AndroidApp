package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AlertDialog
class MainActivity : AppCompatActivity() {






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mainLayout: ConstraintLayout = findViewById(R.id.main)
        val editText: EditText = findViewById(R.id.edit_text)
        val btnClick: Button = findViewById(R.id.btn_hitung)

        btnClick.setOnClickListener {
            val teks: String = editText.text.toString()
//            Snackbar.make(mainLayout, teks, Snackbar.LENGTH_SHORT).show()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("myapp")
            builder.setMessage(teks)
            builder.setPositiveButton("tutup"){
                dialog, which ->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
        }
    }
}