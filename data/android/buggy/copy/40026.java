@java.lang.Override
public void insertUpdate(javax.swing.event.DocumentEvent e) {
    placeOrders.setEnabled(false);
    saveParams.setEnabled(true);
}