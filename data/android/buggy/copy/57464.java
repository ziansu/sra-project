@java.lang.Override
public void run() {
    polygon.setPoints(path);
    if (changeToVisible) {
        polygon.setVisible(true);
    }
    sendNoResult(callbackContext);
}