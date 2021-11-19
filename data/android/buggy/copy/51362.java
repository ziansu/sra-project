@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupBroadcastManagers();
    setProfileInformation();
    setContentView(R.layout.activity_main);
}