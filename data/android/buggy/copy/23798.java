@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(com.jeonbase.wifidirectsample.WakeReceiver.ACTION_PASSIVE)) {
        alarm.setAlarm(context);
    }
}