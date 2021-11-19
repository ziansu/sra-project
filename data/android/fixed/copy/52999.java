private void logInfo(java.lang.String message) {
    android.util.Log.i(jp.straylight.scannerapp.ScanResultsReporter.TAG, message);
    if ((listener) != null) {
        listener.onReport(message);
    }
}