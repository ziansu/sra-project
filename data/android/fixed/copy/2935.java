public android.graphics.Bitmap getPhotoBitmap(android.content.ContentResolver contentResolver, android.net.Uri photoUri) throws java.io.IOException {
    android.graphics.Bitmap photo = null;
    if (photoUri != null) {
        photo = MediaStore.Images.Media.getBitmap(contentResolver, photoUri);
    }
    return photo;
}