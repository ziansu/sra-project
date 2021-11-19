@java.lang.Override
public void onLoadMore(int page, final int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    mNetManager.downloadArticles(page, false, com.android.casopisinterfon.interfon.model.Category.getCategory(mFragPosition));
}