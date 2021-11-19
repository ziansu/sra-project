public void addFooterView(android.view.View footer) {
    mNextLoadEnable = false;
    if (footer == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    this.mFooterView = footer;
    this.notifyDataSetChanged();
}