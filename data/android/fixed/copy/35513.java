@java.lang.Override
public void onAuthenticationSuccess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) throws java.io.IOException, javax.servlet.ServletException {
    response.setStatus(HttpServletResponse.SC_OK);
}