public void setToobarTitle(java.lang.String title) {
    if ((mToolbar) != null) {
        this.title = title;
        getSupportActionBar().setTitle(title);
    }
}