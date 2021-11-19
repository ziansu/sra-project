@java.lang.Override
public void onCallReported() {
    android.util.Log.d(org.a5calls.android.a5calls.controller.IssueActivity.TAG, "call reported successfully!");
    setButtonsEnabled(true);
    tryLoadingNextContact(getResources().getString(R.string.call_reported));
}