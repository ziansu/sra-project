private org.bouncycastle.crypto.params.KeyParameter computeEncryptionKey(byte[] blockBytes) {
    byte[] encKey = cryptDeriveKey(_baseHash, blockBytes, com.healthmarketscience.jackcess.impl.office.ECMAStandardEncryptionProvider.HASH_ITERATIONS, _encKeyByteSize);
    return new org.bouncycastle.crypto.params.KeyParameter(encKey);
}