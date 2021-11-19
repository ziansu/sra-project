@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.unBindService();
    context.stopService(this.serviceBL);
}