@java.lang.Override
public void onRefresh() {
    swipeToRefresh.setEnabled(false);
    mil.nga.dice.report.ReportManager.getInstance().refreshReports();
}