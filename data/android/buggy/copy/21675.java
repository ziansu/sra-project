@java.lang.Override
protected void onResume() {
    super.onResume();
    registerReceiver(br, new android.content.IntentFilter(BroadcastService.COUNTDOWN_BR));
    com.imperium.power.nfcmango.NFCScreen.setupForegroundDispatch(this, mNfcAdapter);
}