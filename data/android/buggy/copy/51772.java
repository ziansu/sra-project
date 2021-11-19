public static void addBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    if ((com.keepingatimeline.kat.BitmapCache.getBitmapFromMemCache(key)) == null) {
        com.keepingatimeline.kat.BitmapCache.getInstance().mMemoryCache.put(key, bitmap);
    }
}