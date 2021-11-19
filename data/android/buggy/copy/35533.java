public void setNotificationBackgroundColorResource(@android.support.annotation.ColorRes
int color) {
    this.notificationBackgroundColor = android.support.v4.content.ContextCompat.getColor(context, color);
    notificationBackgroundDrawable = com.aurelhubert.ahbottomnavigation.AHHelper.getTintDrawable(notificationBackgroundDrawable, notificationBackgroundColor, true);
    updateNotifications(true, com.aurelhubert.ahbottomnavigation.AHBottomNavigation.UPDATE_ALL_NOTIFICATIONS);
}