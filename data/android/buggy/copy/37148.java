public void loadMore(int currentSize, com.jing.app.jjgallery.gdb.view.home.IHomeView homeView) {
    int from = currentSize;
    if (currentSize > 0) {
        from = currentSize - 1;
    }
    com.jing.app.jjgallery.gdb.presenter.GdbGuidePresenter.LoadMoreTask task = new com.jing.app.jjgallery.gdb.presenter.GdbGuidePresenter.LoadMoreTask(homeView);
    addToTask(task, from);
}