@java.lang.Override
public void remove(org.rocksdb.ColumnFamilyHandle columnFamilyHandle, byte[] key) {
    assert isOwningHandle();
    remove(nativeHandle_, key, key.length, columnFamilyHandle.nativeHandle_);
}