@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (btnOk)) {
        new java.lang.Thread(this::execute).start();
    }
}