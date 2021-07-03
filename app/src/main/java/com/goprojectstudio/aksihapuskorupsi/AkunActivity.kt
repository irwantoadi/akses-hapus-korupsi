package com.goprojectstudio.aksihapuskorupsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlin.system.exitProcess

class AkunActivity : AppCompatActivity() {

    lateinit var btn_keluar : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        btn_keluar = findViewById(R.id.btn_keluar)

        btn_keluar.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }
}