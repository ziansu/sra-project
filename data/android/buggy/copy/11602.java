public android.graphics.Bitmap getAsBitmap(java.lang.String key) {
    byte[] bytes = getAsBytes(key);
    return com.zhy.base.cache.disk.Utils.bytes2Bitmap(bytes);
}