public void refreshData() {
    if ((adapter) != null) {
        adapter.removeAll();
        progressBar.setVisibility(View.VISIBLE);
        startService();
        adapter.notifyDataSetChanged();
    }
}