private long getTimeout() {
    long diff = (java.lang.System.currentTimeMillis()) - (mStartTime);
    if (diff > (getSplashTimeOut())) {
        return getSplashTimeOut();
    }
    return (getSplashTimeOut()) - diff;
}