@android.support.annotation.NonNull
private java.io.InputStream getStream(org.thoughtcrime.securesms.crypto.MasterSecret masterSecret, long id) throws java.io.IOException {
    final byte[] cached = cache.get(id);
    return cached != null ? new java.io.ByteArrayInputStream(cached) : new org.thoughtcrime.securesms.crypto.DecryptingPartInputStream(getFile(id), masterSecret);
}