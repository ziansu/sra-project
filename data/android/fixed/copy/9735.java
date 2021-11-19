void onCancelAlready(zemin.notification.NotificationEntry entry) {
    onCancelFinished(entry);
    mCenter.cancel(entry);
}