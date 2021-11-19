private boolean tryLockMap(java.lang.String key) {
    boolean state = _lock_map.tryLock(key);
    return state;
}