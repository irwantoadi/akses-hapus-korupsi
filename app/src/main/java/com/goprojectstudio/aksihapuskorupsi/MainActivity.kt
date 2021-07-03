package com.goprojectstudio.aksihapuskorupsi

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_info_publik : ImageButton
    lateinit var btn_emeeting : ImageButton
    lateinit var btn_moniotoring : ImageButton
    lateinit var btn_lhkpn : ImageButton
    lateinit var btn_aspirasi : ImageButton
    lateinit var btn_agenda : ImageButton
    lateinit var btn_bantuan : ImageButton
    lateinit var btn_donasi : ImageButton
    lateinit var btn_akun : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_info_publik = findViewById(R.id.btn_info_publik)
        btn_emeeting = findViewById(R.id.btn_emeeting)
        btn_moniotoring = findViewById(R.id.btn_monitoring)
        btn_lhkpn = findViewById(R.id.btn_lhkpn)
        btn_aspirasi = findViewById(R.id.btn_aspirasi)
        btn_agenda = findViewById(R.id.btn_agenda)
        btn_bantuan = findViewById(R.id.btn_bantuan)
        btn_donasi = findViewById(R.id.btn_donasi)
        btn_akun = findViewById(R.id.btn_akun)

        btn_info_publik.setOnClickListener {
            var intent = Intent(this@MainActivity, InfoPublikActivity::class.java)
            startActivity(intent)
        }
        btn_emeeting.setOnClickListener {
            var intent = Intent(this@MainActivity, EmeetingActivity::class.java)
            startActivity(intent)
        }
        btn_moniotoring.setOnClickListener {
            var intent = Intent(this@MainActivity, MonitoringActivity::class.java)
            startActivity(intent)
        }
        btn_lhkpn.setOnClickListener {
            var intent = Intent(this@MainActivity, LhkpnActivity::class.java)
            startActivity(intent)
        }
        btn_aspirasi.setOnClickListener {
            var intent = Intent(this@MainActivity, AspirasiActivity::class.java)
            startActivity(intent)
        }
        btn_agenda.setOnClickListener {
            var intent = Intent(this@MainActivity, AgendaActivity::class.java)
            startActivity(intent)
        }
        btn_bantuan.setOnClickListener {
            var intent = Intent(this@MainActivity, BantuanActivity::class.java)
            startActivity(intent)
        }
        btn_donasi.setOnClickListener {
            var intent = Intent(this@MainActivity, DonasiActivity::class.java)
            startActivity(intent)
        }
        btn_akun.setOnClickListener {
            var intent = Intent(this@MainActivity, AkunActivity::class.java)
            startActivity(intent)
        }
    }

    var doubleBackToExitOnce : Boolean = false

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true
        Toast.makeText(this, "Tekan tombol kembali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}