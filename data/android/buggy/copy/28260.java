private void setBarTitle(int titleId) {
    android.util.Log.v(com.misgood.templates.ui.AbstractSignActivity.TAG, "setBarTitle");
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setTitle(titleId);
}