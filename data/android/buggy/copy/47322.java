protected boolean wakeAll(net.xy.codebase.concurrent.Sync.Slot nd) {
    boolean res = false;
    if (nd != null)
        for (; nd != null; nd = nd.getNext())
            res |= nd.wake();
        
    
    return res;
}