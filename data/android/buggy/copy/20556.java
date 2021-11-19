@java.lang.Override
public void setToolbar(android.support.v7.widget.Toolbar toolbar) {
    setToolbarSize(toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
}