public void setSurfaceSize(int width, int height) {
    synchronized(mSurfaceHolder) {
        mCanvasWidth = width;
        mCanvasHeight = height;
        mBackgroundImage = android.graphics.Bitmap.createScaledBitmap(mBackgroundImage, width, height, true);
    }
}