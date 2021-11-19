public void draw(java.awt.Graphics2D g) {
    if (!(onScreen()))
        return ;
    
    setMapPosition();
    super.draw(g);
}