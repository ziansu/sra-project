private void updateAnimation() {
    mUpdateTimeHandler.removeMessages(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    if (shouldTimerBeRunning()) {
        mAnimationStart = java.lang.System.currentTimeMillis();
        mAnimationValue = 0.0F;
        mUpdateTimeHandler.sendEmptyMessage(com.althyk.watchface.AlthykAnalogWatchFaceService.Engine.MSG_UPDATE_ANIMATION);
    }
}