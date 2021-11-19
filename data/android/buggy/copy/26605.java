@java.lang.Override
public void run() {
    javafx.application.Platform.runLater(() -> {
        beginTurn();
    });
}