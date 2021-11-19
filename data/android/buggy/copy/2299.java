protected Request.Builder universal_header(com.squareup.okhttp.Request.Builder chain) {
    chain.addHeader("Accept", "application/json");
    return chain;
}