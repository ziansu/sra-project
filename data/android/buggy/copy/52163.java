@java.lang.Override
public void draw(java.awt.Graphics2D g) {
    cam.draw(g);
    g.setColor(java.awt.Color.BLACK);
    g.fillRect(128, 0, 300, 300);
    g.fillRect(0, 128, 300, 300);
}