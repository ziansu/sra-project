@java.lang.Override
public void onItemClick(int position) {
    startWebViewActivity(getString(R.string.survey_entry_url, surveys.get(position).projectActivityId), getString(R.string.survey_entry_title), true);
}