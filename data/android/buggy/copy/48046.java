@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    com.unit5app.Settings.setArticleSettingsBoolean(0, isChecked);
    com.unit5app.Settings.save(getApplicationContext());
    android.os.Process.killProcess(android.os.Process.myPid());
    java.lang.System.exit(1);
}