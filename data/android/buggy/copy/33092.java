public void setTwitterStatus(final int timeUntilReconnect) {
    invokeAndWaitOnEDT(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            JLTwitterStatus.setText((("Twitter Feed: Reconnecting in " + timeUntilReconnect) + " seconds"));
        }
    });
}