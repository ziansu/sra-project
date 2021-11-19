@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (!(com.ripplex.fileobservertester.RuntimePermissionsChecker.checkSelfStoragePermissions(getApplicationContext()))) {
        com.ripplex.fileobservertester.RuntimePermissionsChecker.requestStoragePermissions(this, com.ripplex.fileobservertester.MainActivity.PERMISSION_REQUEST_CODE);
    }
}