@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getAllFields(javax.servlet.http.HttpServletRequest request) {
    com.stormpath.sdk.servlet.http.UserAgent ua = com.stormpath.sdk.servlet.http.UserAgents.get(request);
    if (ua.isJsonPreferred()) {
        return JSON_BODY_RESOLVER.getAllFields(request);
    }
    return REQ_PARAM_RESOLVER.getAllFields(request);
}