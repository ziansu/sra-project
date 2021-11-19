public void setBorderWidth(double value) {
    if (value < 0) {
        value = 0;
    }
    borderWidths = new javafx.scene.layout.BorderWidths(value);
    updateBorder();
}