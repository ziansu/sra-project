@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    controlPanel.createRoomControl.setDisable(false);
    mainFrm.mazePanel.createMaze(true);
}