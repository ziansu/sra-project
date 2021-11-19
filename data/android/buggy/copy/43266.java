@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_open :
            openFile(FILENAME);
            return true;
        case R.id.action_save :
            saveFile(FILENAME);
            return true;
        default :
            return true;
    }
}