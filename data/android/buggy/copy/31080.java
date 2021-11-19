@java.lang.Override
public void getHistoryItems() {
    android.util.Log.d("66666666666", ("getHistoryItems: " + (latestItemsBean.getDate())));
    new me.aaron.zhihudaily.presenter.MainPresenter.requestHistoryItems().execute(((me.aaron.zhihudaily.presenter.MainPresenter.sHistoryItemsAPI) + (latestItemsBean.getDate())));
}