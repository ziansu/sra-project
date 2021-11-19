private void startUpdating() {
    if ((((mMediaControl) != null) && (getTv().hasCapability(MediaControl.Duration))) && ((mDuration) <= 0)) {
        mMediaControl.getDuration(mDurationListener);
    }
}