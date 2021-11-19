@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.my_stocks, menu);
    restoreActionBar();
    return true;
}