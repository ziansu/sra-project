@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    navigationView.setCheckedItem(R.id.nav_searchpeople);
    com.teamspeaghetti.www.gifster.interiorapplication.commonclasses.Utils.startFragment(new com.teamspeaghetti.www.gifster.interiorapplication.fragments.SearchPeopleFragment(), getSupportFragmentManager());
}