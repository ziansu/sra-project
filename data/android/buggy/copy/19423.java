@java.lang.Override
public void handle(javafx.concurrent.WorkerStateEvent event) {
    java.lang.System.out.println("loginTask.sucess");
    if (storeConfig.isSelected()) {
        storePreference();
    }
    statusDialog.hide();
    loginStatus.setValue(java.lang.Boolean.TRUE);
}