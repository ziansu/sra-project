private void getBitRate() {
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            bitRate();
            handler.postDelayed(this, 2000);
        }
    }, 1);
}