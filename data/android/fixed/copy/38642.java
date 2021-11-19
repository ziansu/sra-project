private static void restoreRequestAttribute(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpSession session, final java.lang.String name) {
    final java.lang.String value = ((java.lang.String) (session.getAttribute(name)));
    request.setAttribute(name, value);
}