@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            setResult(BaseActivity.CODE_RESULT_CHANGED);
            finish();
            break;
        case R.id.action_finish :
            finish();
            break;
    }
    return true;
}