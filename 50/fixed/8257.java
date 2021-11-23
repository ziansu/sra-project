public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    if ((c.getWins()) == 4)
        c.changePanel("4");
    
    repaint();
}