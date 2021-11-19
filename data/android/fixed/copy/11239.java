@java.lang.Override
public void onDestroy() {
    this.processStopRequest(null);
    this.mMediaSession.release();
}