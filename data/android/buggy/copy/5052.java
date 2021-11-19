public boolean keyMayExist(final org.rocksdb.ColumnFamilyHandle columnFamilyHandle, final byte[] key, final java.lang.StringBuffer value) {
    return keyMayExist(nativeHandle_, key, 0, key.length, columnFamilyHandle.nativeHandle_, value);
}