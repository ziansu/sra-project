public void setBorderRadius(double radius) {
    if (radius < 0) {
        radius = 0;
    }
    this.borderRadius = new javafx.scene.layout.CornerRadii(radius);
    updateBorder();
}