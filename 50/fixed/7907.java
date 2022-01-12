@java.lang.Override
public java.lang.Object put(java.lang.String key, java.lang.Object value) {
    java.lang.Object before;
    synchronized(varFileConfig) {
        before = varFileConfig.get(key);
        varFileConfig.set(key, value);
    }
    return before;
}