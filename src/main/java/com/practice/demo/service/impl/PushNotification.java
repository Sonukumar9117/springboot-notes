package com.practice.demo.service.impl;

import com.practice.demo.service.NotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "notifService.value",havingValue = "push")
public class PushNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Push notification is sent");
    }
}
