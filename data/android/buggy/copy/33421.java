@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    de.fau.sensorlib.DsSensorManager.checkBtLePermissions(this, true);
    android.util.Log.d(de.fau.teksample.MainActivity.TAG, ("Ver: " + (Build.VERSION.SDK_INT)));
}