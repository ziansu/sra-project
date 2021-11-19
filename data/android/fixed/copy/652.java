private void setDuration() {
    if ((mDuration) == 0) {
        mDuration = mMusicPlayerService.getDuration();
    }
    mTvDuration.setText(mPlayerUtils.timeToString(mDuration));
}