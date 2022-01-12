public void addSubLaunch(org.eclipse.debug.core.ILaunch subLaunch) {
    synchronized(subLaunches) {
        subLaunches.put(subLaunch, new org.eclipse.debug.core.model.IProcess[]{  });
    }
}