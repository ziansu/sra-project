public void draw(java.awt.Graphics g, int offset, int offset_y) {
    super.draw(g, offset, offset_y);
    moleculeMaker.Arrow.drawBarbs(g, connectee, connector);
}