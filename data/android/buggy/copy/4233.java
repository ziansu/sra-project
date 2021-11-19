private void addInBitmapOptions(android.graphics.BitmapFactory.Options options) {
    options.inMutable = true;
    if ((bitmapPool) != null) {
        android.graphics.Bitmap inBitmap = bitmapPool.getReusableBitmap(options);
        if (inBitmap != null) {
            options.inBitmap = inBitmap;
        }
    }
}