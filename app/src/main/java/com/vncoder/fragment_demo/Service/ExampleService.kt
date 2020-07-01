package com.vncoder.fragment_demo.Service

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.vncoder.fragment_demo.MainActivity
import com.vncoder.fragment_demo.MainActivity4
import com.vncoder.fragment_demo.R
import com.vncoder.fragment_demo.Service.App.Companion.CHANNEL_ID


class ExampleService : Service() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        var input = intent?.getStringExtra("inputExtra")

        var notificationIntent = Intent(this,MainActivity4::class.java)
        var pendingIntent = PendingIntent.getActivity(this,0,notificationIntent,0)

        var notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Example Service")
            .setContentText(input)
            .setSmallIcon(R.drawable.ic_nike)
            .setContentIntent(pendingIntent)
            .build()
        startForeground(1,notification)

        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}