private void stop_clock_count() {
    clockCount.clear();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mClockCount.setText(clockCount.getTime());
        }
    });
}