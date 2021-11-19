@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    if ((Build.VERSION.SDK_INT) > 22) {
        if (needPermission()) {
            askForPermission();
        }
    }else {
        doDefaults();
    }
}