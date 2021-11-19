public java.lang.String writeB64Value(java.lang.String value) {
    if (value == null) {
        return null;
    }
    return isDbEncrypted ? encryptionManager.getEncryptedB64(value) : org.apache.commons.codec.binary.Base64.encodeBase64String(value.getBytes());
}