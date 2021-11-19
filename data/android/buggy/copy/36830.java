@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_insert_dummy_data :
            insertDummyPet();
            displayDatabaseInfo();
            return true;
        case R.id.action_delete_all_entries :
            return true;
    }
    return super.onOptionsItemSelected(item);
}