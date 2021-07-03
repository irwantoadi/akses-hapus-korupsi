package com.goprojectstudio.aksihapuskorupsi

import android.content.Intent
import android.net.nsd.NsdManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LoginActivity : AppCompatActivity() {

    lateinit var btn_masuk : ImageButton
    lateinit var btn_daftar : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_masuk = findViewById(R.id.btn_masuk)
        btn_daftar = findViewById(R.id.btn_daftar)

        btn_masuk.setOnClickListener {
            var intent = Intent(this@LoginActivity, PanduanActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_daftar.setOnClickListener {
            var intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}