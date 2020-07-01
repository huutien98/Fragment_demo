package com.vncoder.fragment_demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_activity3.setOnClickListener {
            startActivity(intent)
        }

        btn_string.setOnClickListener {
            val name = "D0z34g3tm3"
            val email = "email"
            val phone = "phone"
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Phone",phone)
            startActivity(intent)
        }
        btn_img.setOnClickListener {
            val img = R.drawable.ic_apple
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("img",img)
            startActivity(intent)

        }






        btn_implicit_intent.setOnClickListener {
            val intentSendText = Intent()
            intentSendText.action = Intent.ACTION_SEND
            intentSendText.type = "plain/text"
            intentSendText.putExtra(Intent.EXTRA_TEXT, edt_message.text.toString())
            startActivity(Intent.createChooser(intentSendText, "Send message with"))
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("image/*")
        intent.putExtra(Intent.EXTRA_STREAM,data)
        startActivity(Intent.createChooser(intent, "Share with"))
    }

}