public void postStartActivityDismissingKeyguard(final android.app.PendingIntent intent) {
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startPendingIntentDismissingKeyguard(intent);
        }
    });
}