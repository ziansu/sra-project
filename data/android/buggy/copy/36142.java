@javafx.fxml.FXML
protected void handleBackToStartButton(javafx.event.ActionEvent event) throws java.io.IOException {
    ((javafx.scene.Node) (event.getSource())).getScene().getWindow().hide();
}