public void addBitmap(java.lang.String key, android.graphics.Bitmap bitmap) {
    addBitmapToMemoryCache(key, bitmap);
    addBitmapToDiskCache(key, bitmap);
}