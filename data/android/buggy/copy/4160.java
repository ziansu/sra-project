public void stopLoading() {
    android.app.ActionBar actionBar = getActivity().getActionBar();
    if (actionBar != null) {
        actionBar.setSubtitle(null);
    }
}