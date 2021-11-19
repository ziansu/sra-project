public static android.graphics.Bitmap getEmptyBitmap() {
    if ((com.androidquery.callback.BitmapAjaxCallback.empty) == null) {
        com.androidquery.callback.BitmapAjaxCallback.empty = android.graphics.Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    }
    return com.androidquery.callback.BitmapAjaxCallback.empty;
}