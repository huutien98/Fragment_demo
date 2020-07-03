package com.vncoder.fragment_demo

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vncoder.fragment_demo.Item.ItemObject
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    private var mutableList= mutableListOf<ItemObject>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var key = intent.getStringExtra("key")
        tv_intent.setText(key)

        btn_activity3.setOnClickListener {
            startActivity(intent)
        }

        connet.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))
            startActivity(intent)
        }



        btn_string.setOnClickListener {
            val name = "monstar lab lifetime"
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

        btn_object.setOnClickListener {
            var intent = Intent(this,MainActivity3::class.java)

            var itemObject = ItemObject()
            itemObject.img = 0
            itemObject.title = "string"

            intent.putExtra("key",itemObject)
            getIntent().getSerializableExtra("key")
            startActivity(intent)

        }

        btn_bundle.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val bundle = Bundle()

            bundle.putString("Key_1", "String") // Truyền một String
            bundle.putInt("Key_2", 5) // Truyền một Int
            bundle.putBoolean("Key_3", true) // Truyền một Boolean

            intent.putExtras(bundle)
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