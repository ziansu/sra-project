@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean isChecked) {
    mPreferences.edit().putBoolean("showAds", isChecked).apply();
}