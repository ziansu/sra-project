public void onDrawerClosed(android.view.View view) {
    super.onDrawerClosed(view);
    getSupportActionBar().setTitle(user.getDisplayName());
}