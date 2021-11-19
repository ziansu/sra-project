public android.graphics.Bitmap getImageAsBitMap() {
    if ((image) != null)
        return android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
    
    return null;
}