@java.lang.Override
public void onClick(boolean isPositive) {
    com.onelio.connectu.Device.DeviceManager.addShortcutToHorario(getApplicationContext());
    android.widget.Toast.makeText(getBaseContext(), getString(R.string.created_shortcut), Toast.LENGTH_LONG);
}