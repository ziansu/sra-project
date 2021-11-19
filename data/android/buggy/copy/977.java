public void refreshData(java.lang.String url) {
    adapter.removeAll();
    progressBar.setVisibility(View.VISIBLE);
    startService(url);
    adapter.notifyDataSetChanged();
}