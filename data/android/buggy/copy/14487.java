@java.lang.Override
public org.xdi.oxauth.model.common.IdToken createIdToken(java.lang.String nonce, org.xdi.oxauth.model.common.AuthorizationCode authorizationCode, org.xdi.oxauth.model.common.AccessToken accessToken, java.lang.String authMode) throws StringEncrypter.EncryptionException, java.security.SignatureException, org.xdi.oxauth.model.exception.InvalidClaimException, org.xdi.oxauth.model.exception.InvalidJweException, org.xdi.oxauth.model.exception.InvalidJwtException {
    return grant.createIdToken(nonce, authorizationCode, accessToken, getScopes(), authMode);
}