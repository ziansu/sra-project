private void replayOperationSuccess(org.opends.server.replication.common.CSN csn, org.opends.server.types.Entry entry, org.opends.server.types.Modification mod, boolean shouldConflict) throws java.lang.Exception {
    replayOperation(null, csn, entry, mod, shouldConflict);
}