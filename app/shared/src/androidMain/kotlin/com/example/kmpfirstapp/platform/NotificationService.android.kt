package com.example.kmpfirstapp.platform

import androidx.annotation.RequiresPermission
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat


actual object NotificationService {

    private const val CHANNEL_ID = "test_channel"
    private const val NOTIFICATION_ID = 1001

    private lateinit var context: Context

    fun initialize(context: Context) {
        this.context = context.applicationContext
        createNotificationChannel()
    }

    private fun createNotificationChannel() {

        val channel = NotificationChannel(
            CHANNEL_ID,
            "Test Notifications",
            NotificationManager.IMPORTANCE_DEFAULT
        )

        val manager =
            context.getSystemService(
                Context.NOTIFICATION_SERVICE
            ) as NotificationManager

        manager.createNotificationChannel(channel)
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    actual fun showTestNotification() {

        if (
            android.os.Build.VERSION.SDK_INT >= 33 &&
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        val notification =
            NotificationCompat.Builder(
                context,
                CHANNEL_ID
            )
                .setSmallIcon(
                    android.R.drawable.ic_dialog_info
                )
                .setContentTitle("Kanji App")
                .setContentText(
                    "This is a test notification 🎌"
                )
                .setPriority(
                    NotificationCompat.PRIORITY_DEFAULT
                )
                .setAutoCancel(true)
                .build()

        NotificationManagerCompat
            .from(context)
            .notify(
                NOTIFICATION_ID,
                notification
            )
    }
}