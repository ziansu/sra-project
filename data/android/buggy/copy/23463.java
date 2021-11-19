private boolean isChild(org.eclipse.debug.core.ILaunch launch) {
    for (org.eclipse.debug.core.ILaunch subLaunch : subLaunches.keySet()) {
        if (subLaunch == launch) {
            return true;
        }
    }
    return false;
}