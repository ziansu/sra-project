@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.inject(this);
    setSupportActionBar(toolbar);
    userInfo = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    appDrawer();
}