public void appendLogUiThread(final java.lang.String string, final boolean logCatOnly) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            appendLog(string, logCatOnly, false);
        }
    });
}