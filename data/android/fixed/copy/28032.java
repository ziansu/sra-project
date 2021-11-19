@java.lang.Override
public void render(java.awt.Graphics2D g2d) {
    g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    for (phys2d.entities.shapes.Shape entity : entities) {
        entity.draw(g2d, alpha);
    }
}