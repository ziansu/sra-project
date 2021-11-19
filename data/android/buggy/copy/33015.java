public android.graphics.Bitmap getImage() {
    android.graphics.Bitmap newimage = android.graphics.BitmapFactory.decodeByteArray(image.toByteArray(), 0, image.size());
    return newimage;
}