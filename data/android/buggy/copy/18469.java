private com.github.alessiop86.antiantibotcloudflare.http.adapters.okhttp.OkHttpClient getOkHttpClient() {
    return new com.github.alessiop86.antiantibotcloudflare.http.adapters.okhttp.OkHttpClient.Builder().cookieJar(cookieJar).followRedirects(false).build();
}