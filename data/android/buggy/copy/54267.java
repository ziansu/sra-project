public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    Application.DatabaseSessionManager.beginSession();
    showFirstLogin();
}