@java.lang.Override
protected void onDestroy() {
    DedicatedStatics.launched = null;
    saveSettings();
    super.onDestroy();
}