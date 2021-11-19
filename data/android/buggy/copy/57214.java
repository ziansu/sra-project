@java.lang.Override
public void rollbackToSavePoint() throws org.rocksdb.RocksDBException {
    assert isOwningHandle();
    rollbackToSavePoint0(nativeHandle_);
}