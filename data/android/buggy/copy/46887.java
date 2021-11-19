@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if (!(query.isEmpty())) {
        search(query);
    }
    return false;
}