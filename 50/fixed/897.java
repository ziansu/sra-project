public final void releaseRedirect() throws java.io.IOException {
    final java.lang.String location = ((java.lang.String) (this.request.getAttribute(ATTR_KEY)));
    if (location != null) {
        super.sendRedirect(location);
    }
}