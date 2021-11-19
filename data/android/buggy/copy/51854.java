private void doFirstSearch(java.lang.String query) {
    fragmentSearchTask.setLoadingLayout(true);
    fragmentSearchTask.setLastQuery(query);
    fragmentSearchTask.setFirstSearch(true);
    fragmentSearchTask.search(query, 1);
    setLastQuery(query);
}