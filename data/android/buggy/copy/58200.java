public synchronized boolean onBackPressed() {
    if (adapter.isSelectionMode()) {
        adapter.unselectAll();
        updateButtonBar();
        return false;
    }else {
        return true;
    }
}