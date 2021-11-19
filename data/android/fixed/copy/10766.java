private void setPublishVelocity(boolean publishVelocity) {
    if (publishVelocity) {
        mStopPublishAnimator.cancel();
        mPublishVelocity = true;
    }else {
        if (0 >= (mTouchCount)) {
            mStopPublishAnimator.start();
        }
    }
}