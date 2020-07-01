package com.vncoder.fragment_demo

import android.R.layout
import android.app.Notification
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity3 : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn_send.setOnClickListener {
            val intentSendText = Intent()
            intentSendText.action = Intent.ACTION_SEND
            intentSendText.type = "plain/text"
            intentSendText.putExtra(Intent.EXTRA_TEXT, edt_message.text.toString())
            startActivity(Intent.createChooser(intentSendText, "Send message with"))
    }
         next.setOnClickListener {
             intent = Intent(this,MainActivity4::class.java)
             startActivity(intent)
         }
}

}