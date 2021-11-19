public final void releaseRedirect() {
    final java.lang.String location = ((java.lang.String) (this.request.getAttribute(ATTR_KEY)));
    if (location != null) {
        sendRedirect(location);
    }
}