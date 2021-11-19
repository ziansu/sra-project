public void restoreOriginalImage() {
    this.img = bitmapOriginalImage.copy(Bitmap.Config.ARGB_8888, true);
    isChanged = false;
}