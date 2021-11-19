private int getScaledWidth() {
    return vectorImage ? image.getWidth() : ((int) ((zoomFactor) * (image.getWidth())));
}