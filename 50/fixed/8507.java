public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    java.io.PrintWriter out = res.getWriter();
    out.println("<html><body>");
    out.println("<h1>Hello Servlet !!</h1>");
    out.println("</body></html>");
}