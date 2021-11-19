@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.item_clear_history :
            db.clearDB();
            break;
        case R.id.item_history :
            break;
    }
    return super.onOptionsItemSelected(item);
}