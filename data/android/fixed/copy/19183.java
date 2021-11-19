public void setSurfaceSize(int width, int height) {
    synchronized(mSurfaceHolder) {
        mCanvasWidth = width;
        mCanvasHeight = height;
        mBackgroundImage = mBackgroundImage.createScaledBitmap(mBackgroundImage, width, height, true);
    }
}