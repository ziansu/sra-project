private void startUpdating() {
    if (((mMediaControl) != null) && (getTv().hasCapability(MediaControl.Duration))) {
        mMediaControl.getDuration(mDurationListener);
    }
}