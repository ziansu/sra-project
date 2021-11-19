public void setPublicKey(java.lang.String publicKey) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
    this.publicKey = pkcs1ToPublicKey(publicKey);
}