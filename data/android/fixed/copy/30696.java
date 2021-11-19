@java.lang.Override
protected void onResume() {
    updateSignatureStatus();
    registerListeners();
    super.onResume();
}