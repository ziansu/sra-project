public static com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache GetInstance(android.content.Context context) {
    if ((com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance) == null) {
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.ctx = context;
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance = new com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache();
    }
    return com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance;
}