private void init() {
    yanovski.master_thesis.ui.fragments.NewThesisFragment fragment = new yanovski.master_thesis.ui.fragments.NewThesisFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}