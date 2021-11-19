private void onLEDStartTimeSet(int _minutes) {
    actualLightLEDStartTime = _minutes;
    saveSettings(AlarmConstants.WAKEUP_TIMER, actualAlarm, AlarmConstants.ALARM_NAME);
}