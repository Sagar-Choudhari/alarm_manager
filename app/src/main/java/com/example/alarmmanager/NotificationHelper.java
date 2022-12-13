package com.example.alarmmanager;

import android.content.Context;
import android.content.ContextWrapper;

public class NotificationHelper extends ContextWrapper {
    public NotificationHelper(Context base) {
        super(base);
    }
}
