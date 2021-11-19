@java.lang.Override
public void handle(javafx.concurrent.WorkerStateEvent event) {
    if (storeConfig.isSelected()) {
        storePreference();
    }
    statusDialog.hide();
    loginStatus.setValue(java.lang.Boolean.TRUE);
}