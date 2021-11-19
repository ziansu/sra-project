@java.lang.Override
public void onPostExecute(java.util.List<org.ei.opensrp.path.domain.MonthlyTally> monthlyTallies) {
    updateDraftsReportListView(monthlyTallies);
}