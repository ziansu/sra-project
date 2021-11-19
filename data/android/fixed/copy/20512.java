public void setOnLoadMoreListener(java.lang.Runnable onLoadMoreListener) {
    this.onLoadMoreListener = onLoadMoreListener;
    endlessListener.listener = onLoadMoreListener;
}