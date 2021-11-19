private void initBall(java.lang.String ballColor) {
    color = ballColor;
    image = new javax.swing.ImageIcon((("src/resources/pallo" + (color)) + ".png")).getImage();
    tileX = 1;
    tileY = 1;
}