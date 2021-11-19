protected void detachIfNeeded(int idx, WT el, boolean remove) {
    if ((changeMonitor) != null)
        detach(idx, el, remove, false);
    
}