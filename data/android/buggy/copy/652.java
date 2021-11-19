private void setDuration() {
    mDuration = mMusicPlayerService.getDuration();
    mTvDuration.setText(mPlayerUtils.timeToString(mDuration));
}