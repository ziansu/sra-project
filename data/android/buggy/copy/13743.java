public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        onExit();
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
}