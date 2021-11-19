public static android.graphics.Bitmap getBitmapFromBlob(byte[] blob) {
    return android.graphics.BitmapFactory.decodeByteArray(blob, 0, blob.length);
}