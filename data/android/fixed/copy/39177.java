public void stopAlarm() {
    alarmManager.cancel(pendingIntent);
}