public void setActionbarName(java.lang.String title) {
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setTitle(title);
        setTitle(title);
    }
}