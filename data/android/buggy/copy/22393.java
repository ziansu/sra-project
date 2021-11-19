private void getBitRate() {
    handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            bitRate();
            handler.postDelayed(this, 2000);
        }
    }, 1);
}