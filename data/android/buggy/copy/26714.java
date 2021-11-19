@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle(ch.bfh.ti.i2q_2014.prog2.group7.controller.MainApplication.STAGE_TITLE);
    initRootLayout();
    showCDOverview();
}