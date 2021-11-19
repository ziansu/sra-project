private void enableNodeTimeout() {
    nodeTimeOutEnabled = true;
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            nodeTimeoutCheck();
        }
    }, ConfigVals.NODE_TIMEOUT);
}