public com.stupid.method.app.AppManager setXmlInt(java.lang.Object key, int value) {
    getSharedPreferences().edit().putInt(com.stupid.method.app.AppManager.getKey(key), value).commit();
    return this;
}