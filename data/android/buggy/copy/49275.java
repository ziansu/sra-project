@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            super.onBackPressed();
            break;
    }
    return super.onOptionsItemSelected(item);
}