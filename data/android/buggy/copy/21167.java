@java.lang.Override
public void addMorePhotos() {
    (pageOnView)++;
    showSearchResult(query, pageOnView, perPage);
}