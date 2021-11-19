public void openFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().add(R.id.container_main, fragment).commit();
}