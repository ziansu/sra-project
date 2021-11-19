@javafx.fxml.FXML
private void handleKeyReleased(javafx.scene.input.KeyEvent keyEvent) {
    switch (keyEvent.getCode()) {
        default :
            listenCommandInputChanged();
    }
}