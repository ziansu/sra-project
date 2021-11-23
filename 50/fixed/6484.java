long stop() {
    if ((mStartTime) != (-1)) {
        mElapsedTime += (java.lang.System.currentTimeMillis()) - (mStartTime);
    }
    mStartTime = -1;
    return mElapsedTime;
}