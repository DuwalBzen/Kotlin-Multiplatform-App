package com.example.kmpfirstapp.platform


import platform.UserNotifications.UNMutableNotificationContent
import platform.UserNotifications.UNNotificationRequest
import platform.UserNotifications.UNTimeIntervalNotificationTrigger
import platform.UserNotifications.UNUserNotificationCenter

actual object NotificationService {

    actual fun showTestNotification() {

        val center =
            UNUserNotificationCenter.currentNotificationCenter()

        val content =
            UNMutableNotificationContent()

        content.setTitle("Kanji App")

        content.setBody(
            "This is a test notification 🎌"
        )

        content.setSound(
            platform.UserNotifications.UNNotificationSound
                .defaultSound
        )

        val trigger =
            UNTimeIntervalNotificationTrigger
                .triggerWithTimeInterval(
                    1.0,
                    repeats = false
                )

        val request =
            UNNotificationRequest
                .requestWithIdentifier(
                    "test-notification",
                    content = content,
                    trigger = trigger
                )

        center.addNotificationRequest(
            request
        ) { error ->

            if (error != null) {
                println(
                    "Notification error: $error"
                )
            }
        }
    }
}