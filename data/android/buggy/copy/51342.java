@java.lang.Override
public void dispose() {
    super.dispose();
    notifyWindowClosed();
    Resources.Data.getData().writeDataToDisk();
}