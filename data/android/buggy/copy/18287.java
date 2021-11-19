public void windowGainedFocus(java.awt.event.WindowEvent e) {
    if ((Loader.POP_UP) != (this)) {
        java.awt.Toolkit.getDefaultToolkit().beep();
        Loader.POP_UP.requestFocus();
    }
}