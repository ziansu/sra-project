public synchronized boolean onBackPressed() {
    if (((adapter) != null) && (adapter.isSelectionMode())) {
        adapter.unselectAll();
        updateButtonBar();
        return false;
    }else {
        return true;
    }
}