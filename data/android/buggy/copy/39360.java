private void onLEDStartTimeSet(int _minutes) {
    actualLightLEDStartTime = _minutes + 1;
    saveSettings(AlarmConstants.WAKEUP_TIMER, actualAlarm, AlarmConstants.ALARM_NAME);
}