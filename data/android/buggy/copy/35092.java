@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.d("TKT_info", "onOptionMenu");
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}