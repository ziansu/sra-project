@java.lang.Override
public void onTerminate() {
    sk.henrichg.phoneprofilesplus.DatabaseHandler.getInstance(this).closeConnection();
    super.onTerminate();
}