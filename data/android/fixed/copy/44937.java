@java.lang.Override
public void run() {
    runBackupButton.setDisable(value);
    cancelRunningBackupButton.setDisable((!value));
}