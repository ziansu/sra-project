@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mGPSReceiver);
    destroyed = true;
    if ((socket) != null) {
        socket.disconnect();
    }
    connected = false;
}