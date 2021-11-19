@javafx.fxml.FXML
private void handleRedo(javafx.event.ActionEvent e) {
    java.lang.String feedback = _main.handleCommandLine(urgenda.gui.MainController.KEYWORD_REDO);
    displayFeedback(feedback);
    inputBar.clear();
}