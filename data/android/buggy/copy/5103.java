@java.lang.Override
public void onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    android.view.MenuItem menuItem = menu.findItem(R.id.action_day_view);
    menuItem.setChecked(true);
}