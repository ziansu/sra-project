@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case com.sg.clockwork.R.id.action_search :
            return true;
        case com.sg.clockwork.R.id.action_notification :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}