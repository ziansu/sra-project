@java.lang.Override
protected void incrementWindowSize(int increment) throws org.apache.coyote.http2.Http2Exception {
    synchronized(backLogLock) {
        if ((getWindowSize()) < 1) {
            releaseBackLog(increment);
        }
        super.incrementWindowSize(increment);
    }
}