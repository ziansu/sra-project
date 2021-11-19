private void setCurrentTime(int currentTime) {
    if ((mCurrentTime) > currentTime) {
        mLastCurrentTime = mCurrentTime;
        mCurrentTime = currentTime;
    }
}