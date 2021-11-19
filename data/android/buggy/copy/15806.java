public void setProgressWithoutAnimation(int progress) {
    mProgressAngle = (progress / 100.0F) * 360.0F;
    invalidate();
}