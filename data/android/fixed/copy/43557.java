@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            cancelAndReturn();
            return true;
    }
    return super.onOptionsItemSelected(item);
}