public void handleOk(javafx.event.ActionEvent actionEvent) {
    if (checkPrefs()) {
        savePrefs();
        stage.close();
    }
}