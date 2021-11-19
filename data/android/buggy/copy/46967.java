@java.lang.Override
public void onPostExecute(java.util.List<org.ei.opensrp.path.domain.MonthlyTally> monthlyTallies) {
    if ((monthlyTallies != null) && (!(monthlyTallies.isEmpty()))) {
        noDraftsText.setVisibility(View.GONE);
        updateDraftsReportListView(listView, monthlyTallies);
    }
}