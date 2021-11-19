@java.lang.Override
public void handle(javafx.stage.WindowEvent event) {
    try {
        chatController.closeAllConnections();
    } catch (javax.jms.JMSException e) {
        e.printStackTrace();
    }
}