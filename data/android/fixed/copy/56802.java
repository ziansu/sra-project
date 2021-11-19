private boolean executeDEBUG_SHOW_BUNDLE() {
    if (!(com.rfo.basic.Run.Debug))
        return true;
    
    int bundleIndex = getBundleArg();
    if (bundleIndex < 0)
        return false;
    
    WatchedBundle = bundleIndex;
    DialogSelector(5);
    executeDEBUG_SHOW();
    return true;
}