public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    p.drawPlayer(g);
    en.drawEnemy(g);
    p.w.b.drawBullet(g);
}