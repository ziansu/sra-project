private void renderAndUpdateDisplay() {
    jRenderer3D.doRendering();
    if ((imageRegion) != null) {
        imageRegion.setImage(jRenderer3D);
        imageRegion.repaint();
    }
}