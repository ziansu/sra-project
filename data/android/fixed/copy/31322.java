protected void onCreate(android.os.Bundle savedInstanceState) {
    initDataManager();
    super.onCreate(savedInstanceState);
    initGui();
    checkIntent(getIntent());
    if (savedInstanceState == null) {
        showFragment(startFragmentMenuItemId, true);
    }
}