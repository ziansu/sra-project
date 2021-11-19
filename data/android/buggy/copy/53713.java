private void trySelectContentIndex(int searchResultIndex) {
    updateSearchResultIndex(searchResultIndex);
    if (!(searchResultIndexList.isEmpty())) {
        focusIndex(searchResultIndexList.get(searchResultsIndex));
    }
}