public void btDisconnected() {
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            btConnect.setIcon(R.drawable.not);
        }
    });
    if (application.processingService.isProcessing()) {
        application.processingService.stopProcessing();
    }
}