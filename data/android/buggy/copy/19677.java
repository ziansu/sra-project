public void initToolbar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    assert (getSupportActionBar()) != null;
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}