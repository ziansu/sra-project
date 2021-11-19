@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((this.serviceBL) != null) {
        com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.unBindService();
        context.stopService(this.serviceBL);
    }
}