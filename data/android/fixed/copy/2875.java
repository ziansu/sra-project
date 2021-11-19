public com.stupid.method.app.AppManager setXmlString(java.lang.String key, java.lang.String value) {
    getSharedPreferences().putString(key, value);
    return this;
}