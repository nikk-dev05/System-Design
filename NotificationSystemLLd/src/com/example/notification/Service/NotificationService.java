package com.example.notification.Service;

import com.example.notification.Notification.Mainnotification;

public class NotificationService {
    private Mainnotification notification;

    public NotificationService(Mainnotification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}
