public com.stupid.method.app.AppManager setXmlBoolean(java.lang.Object key, boolean value) {
    getSharedPreferences().putBoolean(com.stupid.method.app.AppManager.getKey(key), value);
    return this;
}