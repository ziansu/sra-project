@java.lang.Override
public void onRefresh() {
    mPresenter.loadNews(0, mCategory, false);
}