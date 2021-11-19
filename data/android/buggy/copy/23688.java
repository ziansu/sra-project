protected void setStatus(org.bham.aucom.fts.graph.AbstractAucomGraph.GraphStatus newStatus) {
    log.log(java.util.logging.Level.FINE, ("setting new status " + newStatus));
    copyCurrentToPreviousStatus();
    currentStatus = newStatus;
    org.bham.aucom.main.GraphStateChangedEvent gsce = new org.bham.aucom.main.GraphStateChangedEvent(this, previousStatus, currentStatus);
    fireGraphStatusChangedEvent(gsce);
}