private javax.crypto.SecretKey getSecretKey() throws java.security.NoSuchAlgorithmException {
    javax.crypto.KeyGenerator keyGen = javax.crypto.KeyGenerator.getInstance("AES");
    javax.crypto.SecretKey secretKey = keyGen.generateKey();
    return secretKey;
}