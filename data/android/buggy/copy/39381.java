private static void doDaemonEmail() {
    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            MainIndex.doSendMail();
        }
    });
    thread.setDaemon(true);
    thread.start();
}