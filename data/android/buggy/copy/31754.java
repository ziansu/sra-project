@java.lang.Override
public boolean onUnauthorized(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) {
    try {
        httpServletResponse.sendRedirect("/constellation/login.html");
    } catch (java.io.IOException e) {
    }
    return true;
}