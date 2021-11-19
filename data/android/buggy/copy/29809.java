private void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int id) {
    request.getServletContext().setAttribute((("" + id) + ""), "offline");
    request.getSession().invalidate();
}