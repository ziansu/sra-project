private void paintStatusDot(java.awt.Graphics2D g2, java.awt.Color c) {
    g2.setColor(com.samebug.clients.swing.ui.modules.ColorService.forCurrentTheme(ColorService.OnlineStatus));
    g2.fillOval(2, 2, statusDotSize, statusDotSize);
}