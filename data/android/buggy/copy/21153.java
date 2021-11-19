@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    g.fillRect(30, 50, 45, 80);
    g.fillOval(60, 30, 80, 50);
    g.drawPolygon(xPoints, yPoints, nPoints);
}