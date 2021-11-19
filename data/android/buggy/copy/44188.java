public void unregisterWeakOrientShutdownListener(com.orientechnologies.orient.core.OOrientShutdownListener listener) {
    purgeWeakShutdownListeners();
    weakShutdownListeners.remove(new com.orientechnologies.orient.core.Orient.WeakHashSetValueHolder<com.orientechnologies.orient.core.OOrientShutdownListener>(listener, null, true));
}