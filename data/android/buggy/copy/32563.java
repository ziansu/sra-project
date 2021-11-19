private void loadProxyConfiguration() {
    java.lang.String host = org.omegat.util.Preferences.getPreference(Preferences.HTTP_PROXY_HOST);
    java.lang.String port = org.omegat.util.Preferences.getPreference(Preferences.HTTP_PROXY_PORT);
    hostField.setText(host);
    portSpinner.setValue(port);
}