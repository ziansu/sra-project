@java.lang.Override
protected void onResume() {
    super.onResume();
    SetStatSurface();
    ReadDataStore();
    if (d_isAlarmSetting) {
        SetAlarms();
        com.example.matsumotokazuya.mynidonealarm.LogUtil.LogString("Call SetAlarms");
    }
}