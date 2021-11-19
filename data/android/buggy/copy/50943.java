public void setScaledHeight(int newHeight) {
    if ((newHeight > 0) && (newHeight != (scaledHeight))) {
        scaledHeight = newHeight;
        updateSize();
    }
}