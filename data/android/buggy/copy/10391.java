@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    mLoadMoreListener.onLoadMore(true);
}