@java.lang.Override
public boolean onCreateOptionsMenu(final android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    enableLoginMenu(menu);
    return super.onCreateOptionsMenu(menu);
}