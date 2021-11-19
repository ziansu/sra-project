private void initializeActivity() {
    createPresenter();
    swipeToRefresh.setOnRefreshListener(this);
    swipeToRefresh.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary);
}