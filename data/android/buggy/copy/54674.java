public void registerWeakOrientStartupListener(com.orientechnologies.orient.core.OOrientStartupListener listener) {
    purgeWeakStartupListeners();
    weakStartupListeners.add(new com.orientechnologies.orient.core.Orient.WeakHashSetValueHolder<com.orientechnologies.orient.core.OOrientStartupListener>(listener, removedStartupListenersQueue, true));
}