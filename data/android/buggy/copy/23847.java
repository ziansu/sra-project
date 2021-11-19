public void setMaxHeight(int maxHeight) {
    if ((getHeight()) > maxHeight) {
        quickScaleLayout(mode);
    }
    this.maxHeight = maxHeight;
}