public java.lang.String writeValue(java.lang.String value) {
    return isDbEncrypted ? encryptionManager.getEncrypted(value) : value;
}