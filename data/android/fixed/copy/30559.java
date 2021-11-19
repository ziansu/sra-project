@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    android.util.Log.d("MovieListActivity", "Search Text Change");
    onQueryTextSubmit(s);
    return false;
}