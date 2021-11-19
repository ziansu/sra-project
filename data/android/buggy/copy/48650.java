private void gameDraw() {
    try {
        java.awt.Graphics g2 = this.getGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.err.println("This occurs due to the run loop going through one too many times, and does not actually affect anything.");
    }
}