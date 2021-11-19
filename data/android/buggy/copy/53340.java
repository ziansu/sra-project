@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    Utility.Navigator.getInstance().setStage(primaryStage);
    Utility.Navigator.getInstance().switchToGame();
    primaryStage.setTitle("Maze Runner");
    primaryStage.show();
    java.lang.System.out.println();
}