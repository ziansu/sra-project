@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    initialize();
    this.pStage = primaryStage;
    createPatientDisplay();
    primaryStage.show();
    login = new app.applicationControl.Login();
}