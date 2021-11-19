@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    userInfo = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.inject(this);
    setSupportActionBar(toolbar);
    appDrawer();
}