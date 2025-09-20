package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.widget.Toast


class MainActivity : AppCompatActivity() {






    @SuppressLint("QueryPermissionsNeeded", "UseKtx")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnClick: Button = findViewById(R.id.btn_hitung)
        val btnSecond: Button = findViewById(R.id.btn_second)

        btnClick.setOnClickListener {
//            explicit intent
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("text", "ini adalah data teks saya")
//            intent.putExtra( "number",  123)
            startActivity(intent)
        }

        btnSecond.setOnClickListener {
            val url = "https://googley.com"


            // Coba cara pertama
            try {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)


            } catch (e: Exception) {
                // Jika gagal, coba cara kedua dengan package name browser
                try {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    intent.setPackage("com.android.chrome") // Force menggunakan Chrome
                    startActivity(intent)

                } catch (e: Exception) {
                    // Jika masih gagal, tampilkan error
                    Toast.makeText(
                        this@MainActivity,
                        "Error: ${e.localizedMessage}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}