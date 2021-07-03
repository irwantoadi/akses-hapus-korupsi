package com.goprojectstudio.aksihapuskorupsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    lateinit var btn_daftarkan : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_daftarkan = findViewById(R.id.btn_daftarkan)
        btn_daftarkan.setOnClickListener {
            Toast.makeText(this, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}