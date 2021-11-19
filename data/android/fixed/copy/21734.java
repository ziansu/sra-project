public final void deny() {
    deny(null, null);
    setStatus(HttpServletResponse.SC_FORBIDDEN);
}