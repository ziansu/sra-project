private boolean loginToPlc(org.apache.http.client.CookieStore sessionCookieManager) throws java.io.IOException {
    try (org.apache.http.impl.client.CloseableHttpClient loginClient = clientFactory.createHttpClient(sessionCookieManager)) {
        org.apache.http.client.methods.HttpPost postMethod = createLoginPostMethod();
        connectGetContent(loginClient, postMethod);
    }
    return isAuthenticatedToPlc(sessionCookieManager);
}