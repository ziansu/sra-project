public java.lang.Boolean isAlarmRunning() {
    return stateMap.get("AlarmRunning").equals("1") ? true : false;
}