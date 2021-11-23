@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        configured = false;
        buttonBlockDescription.setText("getDescription blocked");
    }else {
        buttonBlockDescription.setText("getDescription not blocked");
        configured = true;
    }
}