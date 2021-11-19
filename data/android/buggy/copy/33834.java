@java.lang.Override
protected void onNewIntent(final android.content.Intent intent) {
    android.util.Log.d(org.comparemydinner.activity.SearchListActivity.TAG, "onNewIntent");
    setIntent(intent);
    handleIntent(intent);
}