@java.lang.Override
protected void onResume() {
    super.onResume();
    if (com.adonai.GsmNotify.Utils.isTablet(this)) {
        getLoaderManager().getLoader(com.adonai.GsmNotify.SelectorActivity.STATUS_LOADER).onContentChanged();
    }
}