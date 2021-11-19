@javafx.fxml.FXML
void handleAddTransaction(javafx.event.ActionEvent event) throws java.io.IOException {
    util.PopWindow addTransactionPop = new util.PopWindow("/viewFxml/addTransaction.fxml", true, this.getClass());
    ((controllers.AddTransactionController) (getController)).getTransaction();
}