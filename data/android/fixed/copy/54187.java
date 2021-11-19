@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    mLastLocation = getIntent().getParcelableExtra(com.ddup4.autonav.module.main.MainActivity.EXTRA_LAST_LOCATION);
    super.onCreate(savedInstanceState);
}