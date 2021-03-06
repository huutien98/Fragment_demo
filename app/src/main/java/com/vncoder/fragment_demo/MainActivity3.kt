package com.vncoder.fragment_demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity3 : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main3)

         val messager=intent.getStringExtra(Intent.EXTRA_TEXT)
         tv_messager.text = messager

         btn_openLink.setOnClickListener {
             intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
             startActivity(Intent.createChooser(intent,"Open the door"))
         }

         btn_main4activity.setOnClickListener {
             intent= Intent(this,ServiceActivity::class.java)
             startActivity(intent)
         }

         val textReceived = intent.getStringExtra(Intent.EXTRA_TEXT)
         tv_messageReceived.text = textReceived
         val textLink = intent.data.toString()
         tv_messageReceived.text = textLink


         val intentBundle = intent
         val bundle = intent.extras
         if (bundle != null) {
             val value1 = bundle.getString("Key_1", "")
             val value2 = bundle.getInt("Key_2", 0)
             val value3 = bundle.getBoolean("Key_3", false)

             tv_bundle.setText(value1+ " " +value2+ " " +value3 )
         }




         val intent = intent
         val name = intent.getStringExtra("Name")
         val email = intent.getStringExtra("Email")
         val phone = intent.getStringExtra("Phone")
         val resultTv = findViewById<TextView>(R.id.resultTv)
         //setText
         resultTv.text = "Name: "+ name +"\nEmail: "+email+"\nPhone: "+phone

         val imagee = intent.getIntExtra("img",0)
         img_viewintent.setImageResource(imagee)


         val intentObject = intent
         var itemObject = intent.getSerializableExtra("key")
         tv_object.setText(itemObject.toString())


     }


}