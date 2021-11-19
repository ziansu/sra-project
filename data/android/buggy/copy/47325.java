@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    if ((txtTxAddress.getText().length()) >= 10) {
        getToolkit().beep();
        e.consume();
    }
}