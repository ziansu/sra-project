private void tfamtCaretUpdate(javax.swing.event.CaretEvent evt) {
    double fnla;
    fnla = java.lang.Double.parseDouble(tfamt.getText());
    tffinal.setText(("" + fnla));
}