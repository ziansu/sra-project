public static void turnOnReminders(android.content.Context context, org.a5calls.android.a5calls.model.AccountManager manager) {
    if (manager.getAllowReminders(context)) {
        org.a5calls.android.a5calls.model.NotificationUtils.setNotificationTime(context, manager.getReminderMinutes(context));
    }else {
        org.a5calls.android.a5calls.model.NotificationUtils.clearNotifications(context);
    }
}