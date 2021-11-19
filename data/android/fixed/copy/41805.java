void loadSites() {
    new org.wordpress.android.ui.main.SitePickerAdapter.LoadSitesTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}