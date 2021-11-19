@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    gameStage = primaryStage;
    gameStage.setTitle(this.name);
    gameStage.setResizable(false);
    view = new sample.View(this);
    gameController = new sample.Controller(view, 10);
}