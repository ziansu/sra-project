@java.lang.Override
public void onResume() {
    super.onResume();
    mNotificationsEnabled = org.wordpress.android.ui.notifications.utils.NotificationsUtils.isNotificationsEnabled(getActivity());
    refreshSettings();
}