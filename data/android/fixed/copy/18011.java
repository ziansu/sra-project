public void windowClosing(java.awt.event.WindowEvent event) {
    frame.setVisible(false);
    mainLogPanel.save();
    java.lang.System.exit(0);
}