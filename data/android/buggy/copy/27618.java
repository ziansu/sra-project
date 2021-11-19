@javafx.fxml.FXML
private void handleAttachImage(javafx.event.ActionEvent event) {
    images.add(imageUrlTextField.getText());
    imageListView.getItems().add(imageUrlTextField.getText());
}