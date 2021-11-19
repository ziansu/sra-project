public void exitFull() {
    isFull = false;
    mContext = mSaveContext;
    setRootView(mSaveVideoRoot);
    setContentView(R.layout.om_video_mini_layout);
}