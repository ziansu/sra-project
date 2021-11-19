protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    setExtra(request);
    checkLogin(request);
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
}