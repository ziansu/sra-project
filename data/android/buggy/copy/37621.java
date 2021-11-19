@java.lang.Override
public void onSearchTermChanged(java.lang.String term) {
    android.util.Log.e("debug", ("searching.. " + term));
    getSearchResults(term);
}