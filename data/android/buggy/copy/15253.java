@java.lang.Override
public void config() {
    com.booboot.vndbandroid.util.SettingsManager.setUsername(this, null);
    com.booboot.vndbandroid.util.SettingsManager.setPassword(this, null);
    android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    enableAll();
}