public void stopAlarm() {
    alarmManager.cancel(pendingIntent);
    context.unregisterReceiver(receiver);
}