@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.clearRect(0, 0, getWidth(), getHeight());
    game.draw(g);
}