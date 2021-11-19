public void setImage(java.awt.Image image) {
    if ((currentImage) != image) {
        if (image == null) {
            currentImage.flush();
        }
        currentImage = image;
        update();
    }
}