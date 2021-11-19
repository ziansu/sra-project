public void keyPressed(java.awt.event.KeyEvent evt) {
    switch (evt.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_ENTER :
            btnSend.doClick();
        case java.awt.event.KeyEvent.VK_ESCAPE :
            textContent.setText("");
            break;
    }
}