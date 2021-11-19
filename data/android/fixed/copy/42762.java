void initBitmap() {
    mBitmap = android.graphics.Bitmap.createBitmap(1280, 720, Bitmap.Config.ARGB_8888);
    mBitmap.eraseColor(Color.BLACK);
    mImageView.setImageBitmap(mBitmap);
}