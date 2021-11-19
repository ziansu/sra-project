@java.lang.Override
public boolean onSuggestionClick(int position) {
    java.lang.String suggestion = mSuggestionsCursorAdapter.getSuggestion(position);
    mSearchView.setQuery(suggestion, true);
    return false;
}