public com.virtualightning.stateframework.http.Request.Builder header(java.lang.String key, java.lang.String value) {
    if (value != null)
        requestBody.requestHeader.put(key, value);
    
    return this;
}