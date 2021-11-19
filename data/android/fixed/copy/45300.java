private void scheduleAllNotificationInBackground() {
    java.lang.Thread notificationThread = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            super.run();
            cancelAllScheduledNotification();
            scheduleAllNotification();
        }
    };
    notificationThread.start();
}