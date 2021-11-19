@java.lang.Override
public void draw(java.awt.Graphics g) {
    super.draw(g);
    g.setColor(new java.awt.Color(255, 0, 0));
    for (edu.virginia.engine.display.DisplayObject child : getChildren()) {
        drawHitBox(g, child);
    }
}