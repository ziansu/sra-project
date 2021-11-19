@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(getActivity(), query, Toast.LENGTH_SHORT).show();
    return true;
}