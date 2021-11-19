public synchronized void render(java.awt.Graphics g, int x, int y, int width, int height) {
    g.drawImage(frames[currentFrameIndex].getImage(), x, y, width, height, null);
}