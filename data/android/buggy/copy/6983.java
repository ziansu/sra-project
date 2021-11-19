@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    pane = new javafx.scene.layout.Pane();
    javafx.scene.Scene scene = new javafx.scene.Scene(pane, 800, 600);
    stage.setScene(scene);
    stage.show();
}