public void start() {
    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            doStart();
        }
    });
    thread.start();
}