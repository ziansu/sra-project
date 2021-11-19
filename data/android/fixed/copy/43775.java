private void scaleImage(android.graphics.Bitmap bm, android.widget.ImageView iv, int width, int height) {
    iv.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(bm, width, height, false));
}