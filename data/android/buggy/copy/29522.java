public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    java.lang.String outp = request.getParameter("output");
    java.io.PrintWriter out = response.getWriter();
    out.println(out);
}