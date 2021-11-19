private void refreshData() {
    this.checkView();
    new org.axdev.cpuspy.fragments.TimerFragment.RefreshStateDataTask().execute(((java.lang.Void) (null)));
    this.mSwipeLayout.setRefreshing(false);
}