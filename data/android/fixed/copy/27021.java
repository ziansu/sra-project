public com.emc.storageos.auth.idp.OIDCAuthenticationManager getOIDCAuthManager() {
    synchronized(this) {
        if ((_oidcAuthMgr) == null) {
            _oidcAuthMgr = new com.emc.storageos.auth.idp.OIDCAuthenticationManager(_dbClient, _authNProviders);
        }
    }
    return _oidcAuthMgr;
}