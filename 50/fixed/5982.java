@java.lang.Override
public void onDestroy() {
    unregisterReceiver(mConnectionReceiver);
    destroyService();
    super.onDestroy();
}