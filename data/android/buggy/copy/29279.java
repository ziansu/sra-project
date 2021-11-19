@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        finish();
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
    }
    return super.onOptionsItemSelected(item);
}