@java.lang.Override
protected boolean acaoDosEventosDoMenu(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            finish();
            break;
    }
    return true;
}