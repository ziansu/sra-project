public java.lang.String writeValue(java.lang.String value) {
    if (value == null) {
        return null;
    }
    return isDbEncrypted ? encryptionManager.getEncrypted(value) : value;
}