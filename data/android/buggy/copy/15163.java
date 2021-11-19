@java.lang.Override
public com.pratilipi.data.type.BlobEntry getBlob(java.lang.String fileName) throws com.pratilipi.common.exception.UnexpectedServerException {
    com.pratilipi.data.type.BlobEntry blobEntry = memcacheGet(((com.pratilipi.data.BlobAccessorWithMemcache.PREFIX) + fileName));
    if (blobEntry == null) {
        blobEntry = blobAccessor.getBlob(fileName);
        memcachePut(blobEntry);
    }
    return blobEntry;
}