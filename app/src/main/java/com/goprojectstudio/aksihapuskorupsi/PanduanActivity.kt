package com.goprojectstudio.aksihapuskorupsi

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.*
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView

class PanduanActivity : AppCompatActivity() {

    lateinit var text_panduan : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panduan)

        text_panduan = findViewById(R.id.text_panduan)
        text_panduan.makeLinks(
                Pair("Disini", View.OnClickListener {
                    //..........
                }),
                Pair("Lewati", View.OnClickListener {
                    var intent = Intent(this@PanduanActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                })
        )
    }

    fun TextView.makeLinks(vararg links: Pair<String, View.OnClickListener>){
        val spannableString = SpannableString(this.text)
        for (link in links){
            val clickableSpan = object : ClickableSpan(){
                override fun updateDrawState(textPaint: TextPaint) {
                    textPaint.color = Color.parseColor("#0000ff")
                    textPaint.isUnderlineText = true
                }

                override fun onClick(widget: View) {
                    Selection.setSelection((widget as TextView).text as Spannable, 0)
                    widget.invalidate()
                    link.second.onClick(widget)
                }
            }

            val startIndexOfLink = this.text.toString().indexOf(link.first)
            spannableString.setSpan(clickableSpan, startIndexOfLink, startIndexOfLink + link.first.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        this.movementMethod = LinkMovementMethod.getInstance()
        this.setText(spannableString, TextView.BufferType.SPANNABLE)
    }
}