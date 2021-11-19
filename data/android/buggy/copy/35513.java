@java.lang.Override
public void onAuthenticationSuccess(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("--------------------------------------------");
    java.lang.System.out.println("AjaxAuthenticationSuccessHandler");
    java.lang.System.out.println("--------------------------------------------");
    response.setStatus(HttpServletResponse.SC_OK);
}