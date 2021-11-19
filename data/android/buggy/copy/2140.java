public void drawCowboy(java.awt.Graphics g, java.awt.image.BufferedImage image) {
    java.lang.String path = "C:\\Users\\Elina Pavlova\\Desktop\\JavaGameTemp\\src\\Cartoon.png";
    Cowboy.cowboy = image;
    g.drawImage(Cowboy.cowboy, Cowboy.body.x, Cowboy.body.y, null);
}