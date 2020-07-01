package com.vncoder.fragment_demo

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var intent = Intent(this,MainActivity3::class.java)

        btn_1.setOnClickListener {
            startActivity(
                intent.setClassName("com.vncoder.fragment_demo",
                "com.vncoder.fragment_demo.MainActivity3")
            )
        }

        btn_2.setOnClickListener {
            startActivity(intent.setClass(this,MainActivity2::class.java))
        }

        btn_3.setOnClickListener {
            startActivity( intent.setComponent(ComponentName("com.vncoder.fragment_demo",
                "com.vncoder.fragment_demo.MainActivity3")))
        }

        btn_action_view.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))

            val intent2 = Intent()
            intent2.action = Intent.ACTION_VIEW
            intent2.data = Uri.parse("content://contacts/people/")

            startActivity(intent2)
        }

        btn_action_send.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_GET_CONTENT
            intent.type = "image/*"
            startActivityForResult(intent, 0)
            startActivity(intent)
        }

        btn_setdata.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse("content://com.android.providers.downloads.documents/document/downloads/images.jpeg"),
                "image/*")
            startActivity(Intent.createChooser(intent, "Open with"))
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