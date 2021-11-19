public static void stopForegroundDispatch(final android.app.Activity activity, android.nfc.NfcAdapter adapter) {
    if (adapter != null) {
        adapter.disableForegroundDispatch(activity);
    }
}