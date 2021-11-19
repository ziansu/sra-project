public void setThumbnailImage(android.graphics.Bitmap bm) {
    bmThumb = bm;
    if (bm != null) {
        imgThumb.setImageBitmap(bm);
    }
}