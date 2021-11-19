@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            break;
        case R.id.saveTask :
            assembleTaskAndSave();
            break;
    }
    return super.onOptionsItemSelected(item);
}