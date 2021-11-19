private void initBitmap(int res) {
    mBitmap = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    mBitWidth = mBitmap.getWidth();
    mBitHeight = mBitmap.getHeight();
}