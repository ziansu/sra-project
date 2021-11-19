@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    super.onDialogClosed(positiveResult);
    mApi.logout();
}