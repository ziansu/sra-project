private void toaster(java.lang.String message) {
    final java.lang.String toastMessage = message;
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(tcslab.syndesiapp.controllers.localization.WifiService.this, toastMessage, Toast.LENGTH_SHORT).show();
        }
    });
}