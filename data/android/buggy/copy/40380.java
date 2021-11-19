public void setImg(byte[] img) {
    this.img = img;
    bmp = android.graphics.BitmapFactory.decodeByteArray(img, 0, img.length);
}