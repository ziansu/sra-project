public void exitFull() {
    isFull = false;
    mContext = mSaveContext;
    mSaveContext = null;
    setRootView(mSaveVideoRoot);
    setContentView(R.layout.om_video_mini_layout);
}