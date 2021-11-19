protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    long id = java.lang.Long.parseLong(request.getSession().getAttribute("id"));
}