@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onResume() {
    super.onResume();
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.SuppressWarnings(value = "deprecation")
        @java.lang.Override
        public void run() {
            mBluetoothAdapter.startLeScan(mLeScanCallback);
        }
    }).start();
}