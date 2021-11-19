public static android.graphics.Bitmap getBitmapFromBlob(byte[] blob) {
    if (blob == null)
        return null;
    
    return android.graphics.BitmapFactory.decodeByteArray(blob, 0, blob.length);
}