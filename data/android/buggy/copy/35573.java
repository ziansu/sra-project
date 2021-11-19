@javafx.fxml.FXML
private void handleClose(final javafx.event.ActionEvent event) {
    final javafx.stage.Stage stage = this.stageManager.getCurrent();
    if (stage != null) {
        stage.close();
    }
}