@java.lang.Override
protected void doLoadDefault() {
    updateCombo(getPreferenceStore().getDefaultInt(getPreferenceName()));
}