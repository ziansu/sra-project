private void transactionsCheckOutSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
    boolean results = updateCheckOutScreen();
    if (results) {
        VideoManagementSystem.infoBox("Customer successfully located. Select an available video in the list and then press Check Out.", "Check Out");
    }
}