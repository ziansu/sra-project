@java.lang.Override
protected void doLoadDefault() {
    java.lang.System.out.println("Loading default");
    updateCombo(getPreferenceStore().getDefaultInt(getPreferenceName()));
}