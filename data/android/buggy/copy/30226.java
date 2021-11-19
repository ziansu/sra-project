@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.util.Log.i(TAG, "MainActivity.onCreateOptionsMenu()");
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_main, menu);
    mMenu = menu;
    setStartMenuItem();
    return true;
}