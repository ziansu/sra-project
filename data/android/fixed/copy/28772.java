@java.lang.Override
public void onDataUpdated(boolean successful) {
    setRefreshing(false);
    if (!successful) {
        mView.showMessage(R.string.snackbar_error_update_stocks);
    }
}