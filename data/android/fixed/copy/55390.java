@java.lang.Override
public void onRefresh() {
    mAdapter.updateDataSet(eu.davidea.samples.flexibleadapter.services.DatabaseService.getInstance().getDatabaseList(), true);
    mSwipeRefreshLayout.setEnabled(false);
    mRefreshHandler.sendEmptyMessageDelayed(0, 1000L);
    mActionModeHelper.destroyActionModeIfCan();
}