@javafx.fxml.FXML
public void btnMainMenu_OnClick(javafx.event.ActionEvent event) throws java.io.IOException {
    Client.Controller.SoundController.play(SoundController.SoundFile.BUTTONPRESS);
    java.lang.String title = "Mighty Duels";
    java.lang.String root = "MainScreenFXML.fxml";
    Client.Controller.StageController.getInstance().navigate(root, title);
}