@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}