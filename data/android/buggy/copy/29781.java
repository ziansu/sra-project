private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, java.lang.ClassNotFoundException {
    s.defaultReadObject();
    _beanMap = new org.zkoss.bind.impl.WeakIdentityMap<java.lang.Object, java.util.Set<org.zkoss.bind.sys.tracker.TrackerNode>>();
    _equalBeansMap = new org.zkoss.bind.tracker.impl.TrackerImpl.EqualBeansMap();
    _compMap = initCompMap();
}