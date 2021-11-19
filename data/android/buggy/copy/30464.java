public void removeWindowListener(java.awt.event.WindowListener listener) {
    frame.removeWindowListener(listener);
    if ((frame.getWindowListeners().length) < 1)
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
}