@java.lang.Override
public javax.servlet.http.HttpServletResponse wrapResponse(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) {
    return new org.egov.infra.config.session.CookieHttpSessionStrategy.MultiSessionHttpServletResponse(response, request);
}