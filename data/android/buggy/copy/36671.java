@javafx.fxml.FXML
public void onSpanish(javafx.event.ActionEvent actionEvent) throws java.io.IOException {
    super.switchLanguage();
    com.cs3733.teamd.Controller.UserScreenController.pathNodes = null;
    switchScreen(MMGpane, "/Views/UserScreen.fxml");
    setSpanishText();
}