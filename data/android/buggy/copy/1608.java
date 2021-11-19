public static android.graphics.Bitmap getBitmapFromBytes(byte[] image) {
    java.io.ByteArrayInputStream imageStream = new java.io.ByteArrayInputStream(image);
    android.graphics.Bitmap decodedImage = android.graphics.BitmapFactory.decodeStream(imageStream);
    return decodedImage;
}