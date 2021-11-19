@javafx.fxml.FXML
private void handleBtnNumber9() {
    if (inputValue.addDot("9").equals(".")) {
        cashLabel.setText(inputValue.toString());
    }else {
        appendNumberToInput("9");
    }
}