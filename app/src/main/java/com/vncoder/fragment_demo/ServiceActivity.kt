package com.vncoder.fragment_demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.vncoder.fragment_demo.Service.ExampleService
import kotlinx.android.synthetic.main.activity_main4.*


class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        startService.setOnClickListener {
            val input: String = edit_text_input.getText().toString()
            val serviceIntent = Intent(this, ExampleService::class.java)
            serviceIntent.putExtra("inputExtra", input)
            ContextCompat.startForegroundService(this, serviceIntent)
            startService(serviceIntent)

        }
        stopService.setOnClickListener {
            val serviceIntent = Intent(this, ExampleService::class.java)
            stopService(serviceIntent)
        }
    }

    



}