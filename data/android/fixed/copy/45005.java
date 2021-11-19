@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    primaryStage.setTitle("Currency Calculator");
    this.primaryStage = primaryStage;
    primaryStage.setScene(optionsScene());
    primaryStage.setResizable(false);
    primaryStage.show();
}