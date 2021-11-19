@java.lang.Override
public boolean apply(org.apache.hadoop.hbase.regionserver.StoreFile storeFile) {
    if (storeFile == null) {
        throw new java.lang.NullPointerException();
    }
    return (storeFile.getMaximumTimestamp()) >= cutoff;
}