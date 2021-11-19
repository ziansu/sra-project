public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain next) throws java.io.IOException, javax.servlet.ServletException {
    request.setCharacterEncoding(encoding);
    response.setContentType("text/html; charset=UTF-8");
    response.setCharacterEncoding("UTF-8");
    next.doFilter(request, response);
}