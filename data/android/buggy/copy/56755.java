@java.lang.Override
protected void onPause() {
    super.onPause();
    com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.unRegisterBluetoothBroadcast(this);
    context.stopService(this.serviceBL);
}