@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    mMode = mode;
    getMenuInflater().inflate(R.menu.select_all, menu);
    android.util.Log.i("zj", "onCreateActionMode");
    return true;
}