protected void deleteLivreur(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    this.livreurService.delete(java.lang.Integer.parseInt(request.getParameter("id")));
    response.sendRedirect(((request.getContextPath()) + "/livreurs/list"));
}