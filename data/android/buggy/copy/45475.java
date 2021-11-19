private void startFlushTimer() {
    flushTimerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            flush();
        }
    };
    flushTimer = new java.util.Timer();
    flushTimer.schedule(flushTimerTask, 0, bufferIntervalMs);
}