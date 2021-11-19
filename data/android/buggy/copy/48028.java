@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("Home Station");
    initRootLayout();
    showMainDisplay();
    initDataConfiguration();
    testInitSnapshot2();
    initServer();
    initClients();
}