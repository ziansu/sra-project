@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    initialize();
    this.pStage = primaryStage;
    adminStage = new javafx.stage.Stage();
    createPatientDisplay();
    primaryStage.show();
    login = new app.applicationControl.Login();
}