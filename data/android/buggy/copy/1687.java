void handleTag() {
    cordova.getThreadPool().execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.util.Log.d(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("handleTag " + (savedTag)));
            fireTagEvent(tag);
        }
    });
}