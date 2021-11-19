@java.lang.Override
public javax.servlet.http.HttpServletRequest wrapRequest(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) {
    request.setAttribute(org.springframework.session.web.http.HttpSessionManager.class.getName(), this);
    return request;
}