public void init() {
    android.os.HandlerThread handlerThread = new android.os.HandlerThread("zz_handler_thread");
    handlerThread.start();
    android.os.Looper looper = handlerThread.getLooper();
    mHandler = new android.os.Handler(looper);
}