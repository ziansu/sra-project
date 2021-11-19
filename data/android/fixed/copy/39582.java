@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.setColor(clr);
    g.fillOval(0, 0, side, side);
}