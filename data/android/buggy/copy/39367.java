public void clearCanvas() {
    for (java.util.Map.Entry<java.awt.geom.Path2D.Double, java.awt.Color> entry : pathMap.entrySet()) {
        entry.getKey().reset();
    }
    pathMap.clear();
    repaint();
    revalidate();
}