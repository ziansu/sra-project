private void scaleImage(android.graphics.Bitmap bm, android.widget.ImageView iv, int width, int length) {
    iv.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(bm, width, length, false));
}