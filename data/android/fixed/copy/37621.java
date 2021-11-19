@java.lang.Override
public void onSearchTermChanged(java.lang.String term) {
    if ((term.length()) > 1)
        getSearchResults(term);
    
}