private void update() {
    mPanningDirection = null;
    mTotalTime = 0;
    mCurrentPlayTime = 0;
    getImageView().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            scale();
            refreshDisplayRect();
        }
    });
}