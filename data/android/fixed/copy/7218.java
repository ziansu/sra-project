private java.lang.Integer extractTokenRefreshCount(com.nike.vault.client.model.VaultClientTokenResponse clientToken) {
    final java.util.Map<java.lang.String, java.lang.String> meta = clientToken.getMeta();
    return meta == null ? 0 : java.lang.Integer.parseInt(meta.getOrDefault(com.nike.cerberus.security.VaultAuthPrincipal.METADATA_KEY_TOKEN_REFRESH_COUNT, "0"));
}