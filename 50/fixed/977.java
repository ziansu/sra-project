public void refreshData(java.lang.String url) {
    if ((adapter) != null) {
        adapter.removeAll();
        progressBar.setVisibility(View.VISIBLE);
        startService(url);
        adapter.notifyDataSetChanged();
    }
}