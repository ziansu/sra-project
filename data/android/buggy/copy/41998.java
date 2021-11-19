@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    getContext().unregisterReceiver(mRegistrationBroadcastReceiver);
}