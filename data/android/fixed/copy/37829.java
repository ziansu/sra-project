private void drawValue(java.awt.Graphics g, int x, int y, java.lang.String memValueDisplay) {
    g.drawChars(memValueDisplay.toCharArray(), 0, memValueDisplay.length(), x, y);
}