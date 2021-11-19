@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActionBar().setTitle("Settings");
    addPreferencesFromResource(R.xml.preferences);
}