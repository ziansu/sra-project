@java.lang.Override
public boolean has(java.lang.String key) {
    synchronized(varFileConfig) {
        return varFileConfig.contains(key);
    }
}