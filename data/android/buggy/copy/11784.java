public void postStartActivityDismissingKeyguard(final android.content.Intent intent, int delay) {
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            handleStartActivityDismissingKeyguard(intent, true);
        }
    }, delay);
}