@java.lang.Override
public void onClick(android.view.View view) {
    com.morning.AlarmService.snoozeAlarm(this, mAlarm);
    finish();
}