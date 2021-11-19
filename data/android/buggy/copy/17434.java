public java.lang.String getJwtToken(java.lang.String username) throws org.wso2.carbon.identity.jwt.client.extension.exception.JWTClientException {
    return org.wso2.carbon.identity.jwt.client.extension.util.JWTClientUtil.generateSignedJWTAssertion(username, jwtConfig, isDefaultJWTClient);
}