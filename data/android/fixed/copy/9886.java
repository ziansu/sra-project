@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    sharedpreferences = getSharedPreferences(io.rasprovers.remotus.activities.Settings.MyPREFERENCES, Context.MODE_PRIVATE);
}