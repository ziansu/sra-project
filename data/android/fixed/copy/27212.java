@java.lang.Override
public okhttp3.OkHttpClient getOkHttpClient() {
    if ((okHttpClient) == null) {
        okHttpClient = super.getOkHttpClient().newBuilder().addNetworkInterceptor(new com.facebook.stetho.okhttp3.StethoInterceptor()).build();
    }
    return okHttpClient;
}