public static java.util.Map<java.lang.String, java.lang.Object> readQueryParam(javax.servlet.http.HttpServletRequest request) throws java.io.IOException {
    return com.github.obase.webc.Kits.readQueryParam(request.getQueryString(), request.getCharacterEncoding());
}