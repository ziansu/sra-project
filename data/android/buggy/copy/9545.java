@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.drawImage(this.image, this.location.x, ((this.location.y) + (Level.SCORE_BAR)), null);
}