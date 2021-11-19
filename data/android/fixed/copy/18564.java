@java.lang.Override
protected org.sefaria.sefaria.database.LinkFilter doInBackground(java.lang.Void... params) {
    return org.sefaria.sefaria.database.LinkFilter.getLinkFilters(segment);
}