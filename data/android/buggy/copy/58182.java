public void showPageNotFound(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    req.getServletContext().getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
}