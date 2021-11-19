void incDfsUsed(java.lang.String bpid, long value) {
    try (org.apache.hadoop.util.AutoCloseableLock lock = dataset.acquireDatasetLock(true)) {
        org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.BlockPoolSlice bp = bpSlices.get(bpid);
        if (bp != null) {
            bp.incDfsUsed(value);
        }
    }
}