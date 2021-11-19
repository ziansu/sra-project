@javafx.fxml.FXML
private void handleBtnDelete() {
    inputValue.deleteNumber();
    cashLabel.setText(inputValue.toString());
}