@java.lang.Override
public com.claymus.data.transfer.BlobEntry newBlob(java.lang.String fileName, byte[] data, java.lang.String mimeType) {
    return new com.claymus.data.access.gcs.BlobEntryGcsImpl(fileName, data, mimeType);
}