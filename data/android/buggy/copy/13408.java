@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    java.awt.Graphics2D g2d = ((java.awt.Graphics2D) (g));
    g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    type.paint(g2d);
}