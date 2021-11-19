@javafx.fxml.FXML
private void handleBtnPrintAction(javafx.event.ActionEvent event) {
    try {
        parser.getStudentsFromFile();
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        ex.printStackTrace();
    }
}