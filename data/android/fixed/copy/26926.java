@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.example.akgul.movies_application.SettingsActivity.SettingsFragment()).commit();
}