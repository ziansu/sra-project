@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState, @android.support.annotation.Nullable
android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new com.github.hintofbasil.hodl.settings.SettingsFragment()).commit();
}