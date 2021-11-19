protected void proxyRemovedSwing(T proxy) {
    int i = doProxyRemoved(proxy);
    if (i >= 0)
        fireIntervalRemoved(this, i, i);
    
}