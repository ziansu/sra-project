private java.lang.String generateSslKeyName(java.lang.String fingerPrint) {
    java.lang.String uniqueId = fingerPrint.replace(":", "").substring(0, 20);
    return genObjectName("Cloud-Key", uniqueId);
}