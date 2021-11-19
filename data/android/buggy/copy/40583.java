@javafx.fxml.FXML
public final void save(final javafx.event.ActionEvent e) {
    java.io.File file = new java.io.File("save.txt");
    game.savegame(file);
    controller.setScreen(Screens.Home);
}