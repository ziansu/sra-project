public void refresh(final org.dkf.jed2k.kad.KadId id) throws org.dkf.jed2k.exception.JED2KException {
    assert id != null;
    log.debug("[node] refresh on target {}", id);
    org.dkf.jed2k.kad.Traversal t = new org.dkf.jed2k.kad.Refresh(this, self);
    t.start();
}