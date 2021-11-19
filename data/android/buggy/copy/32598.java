@java.lang.Override
protected void onResume() {
    com.filreas.shared.utils.GoSthlmLog.d("onResume");
    super.onResume();
    googleApiClient.connect();
}