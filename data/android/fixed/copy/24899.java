private void initializePushConnector() {
    pushConnector.onStart(getApplicationActivity());
    pushConnector.onResume(getApplicationActivity());
    com.xtreme.plugins.XTremePushPlugin.isInitialized = true;
}