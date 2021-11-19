@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mIds.clear();
    unregisterSensor();
}