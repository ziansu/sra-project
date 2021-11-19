@java.lang.Override
public void run() {
    javafx.application.Platform.runLater(() -> com.alphatrader.javagui.AppState.getInstance().getNotifications().addAll(com.alphatrader.rest.Notification.getUnreadNotifications()));
    com.alphatrader.rest.Notification.markAllAsRead();
}