public void setYScale(double yScale) {
    this.yScale = yScale;
    setHeight(((int) ((list.get(currentIndex).getHeight()) * yScale)));
}