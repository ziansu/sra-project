private void setImage(java.awt.image.BufferedImage img) {
    javafx.scene.image.WritableImage fxImage = new javafx.scene.image.WritableImage(1024, 1024);
    fxImage = javafx.embed.swing.SwingFXUtils.toFXImage(img, fxImage);
    mapView.setImage(map, fxImage);
}