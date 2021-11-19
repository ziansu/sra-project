public void setWaveColor(int behindWaveColor, int frontWaveColor) {
    mBehindWaveColor = behindWaveColor;
    mFrontWaveColor = frontWaveColor;
    mWaveShader = null;
    createShader();
    invalidate();
}