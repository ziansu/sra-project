@java.lang.Override
protected org.sefaria.sefaria.database.LinkFilter doInBackground(java.lang.Void... params) {
    org.sefaria.sefaria.database.LinkFilter linkFilter = org.sefaria.sefaria.database.LinkFilter.getLinkFilters(segment);
    return linkFilter;
}