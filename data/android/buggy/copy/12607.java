public void remove(java.lang.String key) {
    java.util.HashMap map = ((java.util.HashMap) (inheritableThreadLocal.get()));
    if (map != null) {
        map.remove(key);
    }
}