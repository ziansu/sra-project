private void sendData() {
    android.util.Log.d(org.astrobotics.ds2016.io.Protocol.TAG, "Adding Data to send queue");
    sendQueue.offer(new org.astrobotics.ds2016.io.Protocol.ControlData(controlData));
}