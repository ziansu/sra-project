public void setSubtitle(java.lang.String title) {
    android.support.v7.app.ActionBar actionBar = ((ua.boberproduction.floristx.MainActivity) (getActivity())).getSupportActionBar();
    if (actionBar != null) {
        actionBar.setSubtitle(title);
    }
}