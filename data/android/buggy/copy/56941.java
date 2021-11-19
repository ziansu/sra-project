public void mousePressed() {
    if ((mouseButton) == (LEFT)) {
        poly.add(new java.awt.geom.Point2D.Double(mouseX, mouseY));
        x = mouseX;
        y = mouseY;
        time = ANIMATION_TIME;
    }
}