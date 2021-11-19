@java.lang.Override
public long beginTransaction() {
    txContext.reset();
    if (org.zoodb.internal.server.DiskAccessOneFile.ALLOW_READ_CONCURRENCY) {
        sm.readLock(this);
    }else {
        sm.writeLock(this);
    }
    txId = sm.getNextTxId();
    return txId;
}