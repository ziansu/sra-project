@java.lang.Override
public void onReadyToQuit(boolean saveChanges) {
    markReadyToClose();
    org.rstudio.core.client.dom.WindowEx.get().close();
}