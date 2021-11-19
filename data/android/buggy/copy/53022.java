private static void swUnlock() {
    if (org.jikesrvm.VM.sysWriteLockOffset.isMax())
        return ;
    
    org.jikesrvm.scheduler.Synchronization.fetchAndStore(org.jikesrvm.runtime.Magic.getJTOC(), org.jikesrvm.VM.sysWriteLockOffset, 0);
}