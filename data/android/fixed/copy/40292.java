public void draw(java.awt.Graphics2D g) {
    setMapPosition();
    if (!(onScreen()))
        return ;
    
    super.draw(g);
}