@javafx.fxml.FXML
private void enableOrDisableCheckboxes4() {
    if (option4Field.getText().trim().isEmpty()) {
        option4Correct.setDisable(true);
    }else {
        option4Correct.setDisable(false);
    }
}