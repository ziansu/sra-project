public boolean isAuthentication(java.lang.String password) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException {
    return com.openbravo.pos.util.Hashcypher.authenticate(password, this.password);
}