public java.lang.String readValue(java.lang.String string) {
    if (string == null) {
        return null;
    }
    return isDbEncrypted ? encryptionManager.getDecrypted(string) : string;
}