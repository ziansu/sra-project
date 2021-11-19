public void setToobarTitle(java.lang.String title) {
    initToolBar();
    if ((mToolbar) != null) {
        this.title = title;
        getSupportActionBar().setTitle(title);
    }
}