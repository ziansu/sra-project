public void run() {
    javax.swing.JFrame mainFrame = new Frames.MainFrame();
    java.net.URL iconURL = getClass().getResource("/Resources/icon.png");
    mainFrame.setIconImage(new javax.swing.ImageIcon(iconURL).getImage());
    mainFrame.setVisible(true);
}