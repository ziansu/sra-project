@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menu_book_edit_save :
            if (saveBook()) {
                finish();
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}