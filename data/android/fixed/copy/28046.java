public java.lang.String getJwtToken(java.lang.String username, java.util.Map<java.lang.String, java.lang.String> claims) throws org.wso2.carbon.identity.jwt.client.extension.exception.JWTClientException {
    return org.wso2.carbon.identity.jwt.client.extension.util.JWTClientUtil.generateSignedJWTAssertion(username, jwtConfig, isDefaultJWTClient, claims, false);
}