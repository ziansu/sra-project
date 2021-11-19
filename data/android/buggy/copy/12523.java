@javafx.fxml.FXML
private void minimiseWindowListener(javafx.event.ActionEvent e) {
    e.consume();
    _main.getPrimaryStage().setIconified(true);
}