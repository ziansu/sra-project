private void gamePaint() {
    java.awt.Graphics g = canvas.getGraphics();
    g.drawImage(im, 0, 0, null);
    g.dispose();
    java.lang.System.out.println("painting");
}