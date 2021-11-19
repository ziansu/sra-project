private void saveToCache(java.lang.String tokenKey, org.wso2.oauthtosaml.SAMLAssertion samlAssertion) {
    org.wso2.carbon.identity.oauth.cache.OAuthCache oauthCache = org.wso2.carbon.identity.oauth.cache.OAuthCache.getInstance();
    org.wso2.carbon.identity.oauth.cache.CacheKey cacheKey = new org.wso2.carbon.identity.oauth.cache.OAuthCacheKey(tokenKey);
    oauthCache.addToCache(cacheKey, samlAssertion);
}