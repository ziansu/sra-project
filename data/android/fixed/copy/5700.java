@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            this.finish();
            return true;
        case R.id.menu_share :
            onClickShare();
            return true;
    }
    return super.onOptionsItemSelected(item);
}