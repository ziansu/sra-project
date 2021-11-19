private void initialize() {
    if ((listFragment) == null) {
        listFragment = new com.project.coursera.dailyselfie.PhotoListFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, listFragment);
        fragmentTransaction.commit();
    }
}