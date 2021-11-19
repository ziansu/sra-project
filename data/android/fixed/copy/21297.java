private boolean restoreFromBegging() throws java.io.IOException {
    com.orientechnologies.common.log.OLogManager.instance().info(this, "Data restore procedure is started.");
    com.orientechnologies.orient.core.storage.impl.local.OLogSequenceNumber lsn = writeAheadLog.begin();
    return restoreFrom(lsn);
}