@java.lang.Override
protected void onStart() {
    super.onStart();
    initQbrtcClient();
    initChatClient();
    showWaitingFragment();
    usbScanner.startScan();
}