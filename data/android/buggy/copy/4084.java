private void refreshAdapter() {
    ruleList.clear();
    ruleList.addAll(preferencesService.getUserRules());
    notifyDataSetChanged();
    notifyDataSetInvalidated();
}