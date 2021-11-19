@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_QUERY, mSearchQuery);
    outState.putBoolean(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_MODE, mSearchMode);
}