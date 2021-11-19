public void addToWindow() {
    if (!(mPreferences.getBoolean(SettingsFragment.KEY_FLOAT_VIEW_TOGGLE, true)))
        return ;
    
    mWindowManager.addView(this, mParams);
}