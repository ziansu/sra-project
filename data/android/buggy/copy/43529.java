public static byte[] bitmapToByteArray(android.graphics.Bitmap image) {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    image.compress(Bitmap.CompressFormat.JPEG, 70, bos);
    return bos.toByteArray();
}