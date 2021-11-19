public void notifyDataSetChanged() {
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }else {
        init();
    }
}