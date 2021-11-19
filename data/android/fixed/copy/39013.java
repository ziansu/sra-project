public void run() {
    if (bitmap != null) {
        updateFromBitmap(bitmap);
    }else
        if (grayscale != null) {
            org.gearvrf.NativeBitmapImage.update(bitmapImage.getNative(), width, height, grayscale);
        }
    
}