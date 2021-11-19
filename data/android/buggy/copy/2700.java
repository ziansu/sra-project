protected java.lang.String getUserId(javax.servlet.http.HttpServletRequest request) {
    return request.getAttribute(attributeName).toString();
}