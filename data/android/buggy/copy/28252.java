@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    drawerToggle.setHomeAsUpIndicator(R.drawable.ic_drawer);
    drawerToggle.syncState();
}