public void update() {
    java.awt.image.BufferedImage image = renderer.render(fractalManager.getActiveFractal(), getWidth(), getHeight());
    if (image != null) {
        this.image = image;
        repaint();
    }
}