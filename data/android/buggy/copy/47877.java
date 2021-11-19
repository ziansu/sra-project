@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    mNewsListPresenter.setView(null);
    com.fjoglar.etsitnews.presenter.PresenterHolder.getInstance().putPresenter(com.fjoglar.etsitnews.view.activities.NewsListActivity.class, mNewsListPresenter);
}