public final void addNotification(com.notification.Notification note, com.utils.Time time) {
    note.setNotificationManager(this);
    m_notifications.add(note);
    notificationAdded(note, time);
}