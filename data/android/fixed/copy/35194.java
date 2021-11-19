@java.lang.Override
public void remove(java.lang.String key) {
    synchronized(varFileConfig) {
        varFileConfig.set(key, null);
    }
}