public void refresh(android.app.Activity activity) {
    mActivity = activity;
    new net.skweez.sipgate.model.AccountInfo.RefreshAccountInfoTask().execute();
}