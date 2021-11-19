@java.lang.Override
public java.lang.String chooseClientAlias(javax.net.ssl.X509KeyManager keyManager, javax.security.auth.x500.X500Principal[] issuers, java.lang.String[] keyTypes) {
    return keyManager.chooseClientAlias(keyTypes, null, this);
}