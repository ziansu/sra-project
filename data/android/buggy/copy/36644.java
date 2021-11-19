@java.lang.Override
public void onCallReported() {
    android.util.Log.d(org.a5calls.android.a5calls.controller.IssueActivity.TAG, "call reported successfully!");
    android.support.design.widget.Snackbar.make(issueName, getResources().getString(R.string.call_reported), Snackbar.LENGTH_SHORT).show();
    setButtonsEnabled(true);
    tryLoadingNextContact();
}