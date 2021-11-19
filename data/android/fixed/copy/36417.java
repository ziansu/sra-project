public void registerClient(com.wojtechnology.sunami.MainActivity activity) {
    mContext = activity;
    mBound = true;
    if (!(mIsInit)) {
        init();
        mIsInit = true;
    }else {
        mContext.setProgressBar(false);
        mContext.setRecyclerViewData();
    }
}