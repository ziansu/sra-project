public void setPublicKey(java.lang.String publicKey) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
    byte[] pkcs1PublicKey = pemToData(publicKey);
    this.publicKey = pkcs1ToPublicKey(pkcs1PublicKey);
}