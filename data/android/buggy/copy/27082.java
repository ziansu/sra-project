@java.lang.Override
protected void onDestroy() {
    mConnectedThread.cancel();
    try {
        btSocket.close();
    } catch (java.io.IOException e2) {
        finish();
    }
    super.onDestroy();
}