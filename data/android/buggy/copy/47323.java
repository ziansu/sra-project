@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    android.util.Log.d("myLogs", newText);
    pleaseSearchIt(newText);
    return true;
}