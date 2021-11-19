private long getTimeout() {
    long diff = (java.lang.System.currentTimeMillis()) - (mStartTime);
    if (diff > (getSplashTimeOut())) {
        return 0;
    }
    return (getSplashTimeOut()) - diff;
}