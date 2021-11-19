protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDataManager();
    initGui(savedInstanceState);
    checkIntent(getIntent());
    if (savedInstanceState == null) {
        showFragment(startFragmentMenuItemId, true);
    }
}