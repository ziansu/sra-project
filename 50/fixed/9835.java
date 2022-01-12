private boolean logoutOfPlc(org.apache.http.client.CookieStore sessionCookieManager) throws java.io.IOException {
    try (org.apache.http.impl.client.CloseableHttpClient logoutClient = clientFactory.createHttpClient(sessionCookieManager)) {
        org.apache.http.client.methods.HttpPost postMethod = createLogoutPostMethod();
        connectGetContent(logoutClient, postMethod);
    }
    return !(isAuthenticatedToPlc(sessionCookieManager));
}