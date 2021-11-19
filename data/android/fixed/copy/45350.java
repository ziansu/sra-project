public android.graphics.Bitmap getBitmap(java.lang.String key) {
    android.graphics.Bitmap bitmap = getBitmapFromMemoryCache(key);
    if (bitmap == null) {
        synchronized(this) {
            bitmap = getBitmapFromDiskCache(key);
        }
    }
    return bitmap;
}