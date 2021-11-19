private void initBall(java.lang.String ballColor) {
    color = ballColor;
    javax.swing.ImageIcon ii = new javax.swing.ImageIcon((("src/resources/pallo" + (color)) + ".png"));
    image = ii.getImage();
    tileX = 1;
    tileY = 1;
}