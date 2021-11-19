@java.lang.Override
public void handle(javafx.stage.WindowEvent event) {
    tcpServer.stopServer();
    javafx.application.Platform.exit();
    java.lang.System.exit(0);
}