public void saveCurrentBill() throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    dao.saveBill(currentBill);
    clearCurrentBill();
}