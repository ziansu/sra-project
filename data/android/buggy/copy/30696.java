@java.lang.Override
protected void onResume() {
    updateSignatureStatus();
    updateSMSCPref();
    registerListeners();
    super.onResume();
}