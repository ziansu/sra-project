public void setProgressWithoutAnimation(int progress) {
    mProgressAngle = 360.0F - ((progress / 100.0F) * 360.0F);
    invalidate();
}