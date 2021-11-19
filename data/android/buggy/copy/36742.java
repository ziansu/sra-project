public void setCornerDimensions(org.eclipse.draw2d.geometry.Dimension d) {
    if (d == null) {
        corner.width = 0;
        corner.height = 0;
    }
    corner.width = d.width;
    corner.height = d.height;
}