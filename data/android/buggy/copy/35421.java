public int getProxyPort() {
    try {
        return java.lang.Integer.parseInt(getString(prefApp, R.string.pref_key__http_proxy_port, "0"));
    } catch (java.lang.Exception e) {
        setString(prefApp, R.string.pref_key__http_proxy_port, "0");
        return 0;
    }
}