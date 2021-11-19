private void engageBulkhead() {
    integrity = (integrity) + (main.Door.BULKHEAD_STRENGTH);
    bulkhead = true;
    closeLock();
}