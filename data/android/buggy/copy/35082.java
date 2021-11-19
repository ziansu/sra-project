public void windowClosing(java.awt.event.WindowEvent e) {
    animator.stop();
    frame.dispose();
    java.lang.System.exit(0);
}