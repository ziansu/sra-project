@javafx.fxml.FXML
private void showmoreListener(javafx.event.ActionEvent e) {
    e.consume();
    _main.handleCommandLine(urgenda.gui.MainController.KEYWORD_SHOWMORE);
}