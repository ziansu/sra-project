long stop() {
    mElapsedTime += (java.lang.System.currentTimeMillis()) - (mStartTime);
    return mElapsedTime;
}