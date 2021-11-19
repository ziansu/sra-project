@java.lang.Override
protected void onStart() {
    super.onStart();
    if ((connectionFragment) != null) {
        attemptConnection();
    }
}