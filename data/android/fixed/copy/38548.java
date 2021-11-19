public void createInstance(android.view.View v) {
    this.progressDialogWaitStop.show();
    new org.stackdroid.activities.ServersActivity.AsyncTaskOSListImages().execute();
    if ((this.manageInstanceDialog) != null)
        this.manageInstanceDialog.dismiss();
    
}