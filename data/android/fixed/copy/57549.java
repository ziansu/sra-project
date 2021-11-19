private static com.emc.storageos.auth.impl.AuthenticationProvider getOIDCProvider(com.emc.storageos.db.client.model.AuthnProvider authenticationConfiguration) {
    return new com.emc.storageos.auth.impl.AuthenticationProvider(null, null, authenticationConfiguration);
}