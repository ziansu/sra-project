@java.lang.Override
protected void onResume() {
    super.onResume();
    app.requireAuthentication(this);
    updateMap();
}