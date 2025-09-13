package com.example.myapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
class MainActivity : AppCompatActivity() {
//    berikut adalah tipe dan variable data
//    jika ingin menulis tipe atau variable data harus diawali dengan
//    val kemudian dilanjutkan dengan nama variablenya baru titik dua
//    dan barulah tipe datanya kemudian baru sama dengan terus isinya

//    bedanya val dan var. jika ingin bisa mengubah didalam variable
//    pakai var dan jika konstanta pakai val


//    null. jika ingin buat null harus ada tanda tanyanya apapun tipenya

    val bilanganNull: Int? = null

//    angka
    var angkaBulat: Int = 10

    val angkaDesimal: Double = 12.5
    val angkaPanjang: Long=900000000000000L
// karakter atau kalimat
    val karakter: Char = 'A'
    var kata: String = "ini adalah contoh teks panjang" +
            " enter"

//    logika boolean
    var benar: Boolean = true
    val salah: Boolean = false

//    array. untuk diarrah harus ada <> kemudian diisi tipe data didalam
//    kurung yang berbentuk panah tersebut. kemudian cara isinya dengan
//    arrayOf untuk mengisinya.
    val angkaArray: Array<Int> = arrayOf(1,2,3,4,5)
    val stringArray: Array<String> = arrayOf("aku"," adalah ", "programmer")
    val booleanArray: Array<Boolean> = arrayOf(true, false, true)

// function didalam kotlin
    fun hitung(angka: Int, kata: String){

    }

    fun hitung(){
        angkaBulat++
    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView: TextView = findViewById(R.id.text_view)
        val btnHitung: Button = findViewById(R.id.btn_hitung)

        btnHitung.setOnClickListener {
            hitung()
            textView.text = angkaBulat.toString()
        }



//        //    if dan elsenya
//        if(angkaBulat == 4 && angkaDesimal>13){
//            benar = true
//            kata = "aku adalah mahasiswa"
//        }else{
//            benar = false
//        }

    }
}