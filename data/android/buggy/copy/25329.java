@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.main_preferences);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(R.string.settings_title);
}