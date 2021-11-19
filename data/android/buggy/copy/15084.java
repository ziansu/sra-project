protected final void redirect(java.lang.String url) {
    resp.setHeader("Location", url);
    setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
}