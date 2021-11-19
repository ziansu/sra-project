private void updateAnimation() {
    mAnimationValue = 1.0F;
    mUpdateTimeHandler.removeMessages(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    if (shouldTimerBeRunning()) {
        mAnimationStart = java.lang.System.currentTimeMillis();
        mAnimationValue = 0.0F;
        mUpdateTimeHandler.sendEmptyMessage(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    }
}