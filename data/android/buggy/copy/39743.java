@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.util.Log.v(TAG, "onCreateOptionsMenu()");
    getMenuInflater().inflate(R.menu.options_menu, menu);
    return true;
}