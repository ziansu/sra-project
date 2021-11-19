@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_book_edit_save :
            if (saveBook()) {
                finish();
            }
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}