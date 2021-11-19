@java.lang.Override
protected void onResume() {
    super.onResume();
    searchView.activityResumed();
    java.lang.String[] arr = getResources().getStringArray(R.array.suggestions);
    searchView.saveSuggestions(arr);
}