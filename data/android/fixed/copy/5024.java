private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {
    clearProductDetails();
    inventory.removeProduct(currentProductID);
    updateInventoryList();
    updateFinancials();
}