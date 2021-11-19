@org.junit.Before
public void start() {
    org.semux.core.PendingManagerTest.pendingMgr = new org.semux.core.PendingManager();
    org.semux.core.PendingManagerTest.pendingMgr.start(org.semux.core.PendingManagerTest.chain, org.semux.core.PendingManagerTest.channelMgr);
}