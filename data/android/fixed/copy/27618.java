@javafx.fxml.FXML
private void handleAttachImage(javafx.event.ActionEvent event) {
    if (imageUrlTextField.getText().isEmpty()) {
        images.add(imageUrlTextField.getText());
        imageListView.getItems().add(imageUrlTextField.getText());
    }
}