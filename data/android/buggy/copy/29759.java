@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    if (s.equals(searchView.getQuery().toString())) {
        adapterView.refreshEvents();
        adapterView.getFilter(s);
    }
    return false;
}