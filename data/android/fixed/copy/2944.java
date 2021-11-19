private void serveApiModel(final javax.servlet.http.HttpServletResponse res) throws java.lang.Exception {
    res.setContentType(com.google.common.net.MediaType.JSON_UTF_8.toString());
    this.mapper.writeValue(res.getWriter(), readModel());
}