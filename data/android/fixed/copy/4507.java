private void onDataLoaded(nich.work.aequorea.main.model.mainpage.Data data) {
    (mPage)++;
    mBaseView.onDataLoaded(data.getData(), mBaseView.getModel().isRefreshing());
    setLoadingFinish();
}