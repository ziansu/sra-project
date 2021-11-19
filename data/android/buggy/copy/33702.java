@java.lang.Override
protected void onPause() {
    super.onPause();
    mApp.handleChange(Application.DATA_OTHER);
    mApp.onPause();
}