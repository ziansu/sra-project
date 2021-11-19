@java.lang.Override
public void commence(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.AuthenticationException arg2) throws java.io.IOException, javax.servlet.ServletException {
    log.debug("Pre-authenticated entry point called. Rejecting access");
    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Access Denied");
}