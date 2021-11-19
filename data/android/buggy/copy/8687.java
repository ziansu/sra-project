public void killRequest() {
    if (((mRequestThread) != null) && (mIsWorking)) {
        mRequestThread.interrupt();
    }
}