private void initMain() {
    mainFragment = new com.zrecovery.ui.fragment.MainFragment();
    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, mainFragment).commit();
}