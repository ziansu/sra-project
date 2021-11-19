public java.awt.geom.Ellipse2D returnGuessEllipse(int turn, int column) {
    return new java.awt.geom.Ellipse2D.Double(((column * 60) + 30), ((turn * 60) + 30), 50, 50);
}