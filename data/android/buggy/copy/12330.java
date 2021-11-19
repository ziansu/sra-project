public void setTwitterStatus(final boolean isEnabled) {
    invokeAndWaitOnEDT(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (isEnabled) {
                JLTwitterStatus.setText("Twitter Feed: Connected");
            }else {
                JLTwitterStatus.setText("Twitter Feed: Disconnected");
            }
        }
    });
}