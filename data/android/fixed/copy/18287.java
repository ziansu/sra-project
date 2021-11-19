public void windowGainedFocus(java.awt.event.WindowEvent e) {
    if ((Loader.POP_UP) != (this)) {
        java.awt.Toolkit.getDefaultToolkit().beep();
        requestFocus();
    }
}