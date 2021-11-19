@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);
    outState.putString(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_QUERY, mSearchQuery);
    outState.putBoolean(com.gh4a.activities.IssueListActivity.STATE_KEY_SEARCH_MODE, mSearchMode);
}