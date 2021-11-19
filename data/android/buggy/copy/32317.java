public java.util.List<byte[]> hvals(final byte[] key) {
    checkIsInMulti();
    client.hvals(key);
    final java.util.List<byte[]> lresult = client.getBinaryMultiBulkReply();
    return lresult;
}