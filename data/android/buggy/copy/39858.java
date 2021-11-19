@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.wtf("!!!!!!!!!!!!", query);
    findAttendees(query);
    return true;
}