private void drawPoint(java.awt.Graphics2D g2, double scale, georegression.struct.point.Point2D_F32 a, java.awt.Color blue) {
    float y = a.y;
    float x = a.x;
    drawPoint(g2, scale, blue, y, x);
}