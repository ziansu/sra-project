@java.lang.Override
public void merge(org.rocksdb.ColumnFamilyHandle columnFamilyHandle, byte[] key, byte[] value) {
    assert isOwningHandle();
    merge(nativeHandle_, key, key.length, value, value.length, columnFamilyHandle.nativeHandle_);
}