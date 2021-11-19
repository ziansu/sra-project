@java.lang.Override
public void onResume() {
    super.onResume();
    setActualEventsList();
    setBirthdaysList();
    startServiceOfNotifications();
}