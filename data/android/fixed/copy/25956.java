private static java.lang.String getGroupKey(final android.service.notification.StatusBarNotification sbn) {
    if (sbn instanceof com.oasisfeng.nevo.StatusBarNotificationCompat)
        return ((com.oasisfeng.nevo.StatusBarNotificationCompat) (sbn)).getBaseGroupKey();
    
    return sbn.getGroupKey();
}