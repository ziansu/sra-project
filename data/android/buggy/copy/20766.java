@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean isChecked) {
    mPreferences.edit().putBoolean("showAds", isChecked).apply();
    android.widget.Toast.makeText(this, "Restart application for the changes to take effect!", Toast.LENGTH_LONG).show();
}