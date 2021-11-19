public void close() {
    java.lang.System.out.println("Closing BluetoothBandService.");
    disconnectSocket();
    mContext.unregisterReceiver(mReceiverBTDiscover);
    mContext.unregisterReceiver(mReceiverBTConnect);
}