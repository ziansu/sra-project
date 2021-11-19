public static void post(java.lang.String url, com.loopj.android.http.RequestParams params, com.loopj.android.http.AsyncHttpResponseHandler responseHandler) {
    ca.shahnewazkhan.locator.LocatorRestClient.client.post(ca.shahnewazkhan.locator.LocatorRestClient.getAbsoluteUrl(url), params, responseHandler);
}