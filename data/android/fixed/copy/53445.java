@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.i("SaleHistory", "onQueryTextSubmit called!");
    return onQueryTextChange(query);
}