public void finish(com.art.alligator.TransitionAnimation animation) {
    if (animation.needDelayActivityFinish()) {
        mActivity.supportFinishAfterTransition();
    }else {
        mActivity.finish();
    }
    animation.applyToActivityAfterFinish(mActivity);
}