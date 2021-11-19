@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String q) {
    query = q;
    search();
    return true;
}