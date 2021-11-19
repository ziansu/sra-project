@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    restart(grid, scoreLabel, sideGrid, preview, layoutGrid);
    scene.setOnKeyPressed(new KeyHandler());
}