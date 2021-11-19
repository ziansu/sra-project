@javafx.fxml.FXML
void getServerSelected() {
    org.parabot.launcher.Controller.server = serverToggleButton.isSelected();
    handleServerTextField();
}