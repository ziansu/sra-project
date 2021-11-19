public void startAndRestoreTime() {
    if ((this.pauseTime) > 0) {
        this.millisInFuture -= (android.os.SystemClock.elapsedRealtime()) - (this.pauseTime);
        this.pauseTime = 0;
    }
}