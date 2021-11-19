public synchronized void addPendingAlarm(android.content.Context context, android.content.Intent intent) {
    alarmPendingList.add(intent);
    android.util.Log.d(mobile.dp.velocityalarmclock.AlarmCoordinator.TAG, ("addPendingAlarm - pending alarm added. new size of pending list is: " + (alarmPendingList.size())));
}