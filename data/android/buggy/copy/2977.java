public void storeImage(java.lang.String completePath, android.net.Uri fileUri, android.content.Context context) {
    android.graphics.Bitmap bitmap = compressBitmap(fileUri, context);
    storeImage(completePath, bitmap);
}