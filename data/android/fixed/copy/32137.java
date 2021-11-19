public void setImageSize(int width, int height) {
    int size = java.lang.Math.min(width, height);
    thresholdDistance = size * 0.005;
}