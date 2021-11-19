public void addHeaderView(android.view.View view) {
    if ((view != null) && ((mHeaderView) == null)) {
        mHeaderView = view;
        mGloriousAdapter.notifyItemInserted(0);
    }
}