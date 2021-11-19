@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_compose_message, menu);
    if ((Build.VERSION.SDK_INT) < 11) {
        android.view.MenuItem copyUrl = menu.findItem(R.id.menu_copy_url);
        copyUrl.setVisible(false);
    }
    return true;
}