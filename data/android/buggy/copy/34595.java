@java.lang.Override
public void run() {
    if (!(running)) {
        this.cancel();
    }
    javafx.application.Platform.runLater(() -> date.setText(convertDate(dateInstance)));
}