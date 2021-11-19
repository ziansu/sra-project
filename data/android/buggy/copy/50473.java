@java.lang.Override
protected okhttp3.Request buildRequest(okhttp3.RequestBody requestBody) {
    if ((params) != null)
        url = appendParams(url, params);
    
    return builder.get().build();
}