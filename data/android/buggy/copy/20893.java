public void setLayer(int newLayer) {
    this.setX(java.lang.Math.abs(((newLayer - (this.getBoundsInLocal().getMinX())) - (layer))));
    this.layer = newLayer;
}