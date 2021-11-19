public void onClick(android.view.View v) {
    if (deleteImageFromGallery()) {
        nextImage(0);
        updateBackgroundImage();
    }
}