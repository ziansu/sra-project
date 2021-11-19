public void onClick(android.content.DialogInterface dialog, int whichButton) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            importUnmatchedPrivateKey(key);
        }
    });
}