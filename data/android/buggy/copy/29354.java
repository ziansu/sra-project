private void setUpNavigationDrawer() {
    android.content.Context context = getApplicationContext();
    drawerAdapter = new com.blstream.studybox.components.DrawerAdapter(navigationView, drawerLayout, toolbar, context);
    drawerAdapter.attachDrawer();
}