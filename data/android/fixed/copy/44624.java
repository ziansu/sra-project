public static boolean optionsItemSelected(com.gcode.notes.activities.compose.list.ComposeListActivity composeListActivity, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case android.R.id.home :
            new com.gcode.notes.activities.helpers.compose.list.ComposeListSaveHelper(composeListActivity).saveList();
    }
    return false;
}