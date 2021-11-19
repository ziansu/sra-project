private void initializeActivity() {
    mNewsListPresenter = createPresenter();
    swipeToRefresh.setOnRefreshListener(this);
    swipeToRefresh.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary);
}