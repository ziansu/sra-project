public void windowClosing(java.awt.event.WindowEvent event) {
    frame.setVisible(false);
    mainLogPanel.save("LOGS");
    java.lang.System.exit(0);
}