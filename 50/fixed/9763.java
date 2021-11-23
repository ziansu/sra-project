public void addUserInSession(javax.servlet.http.HttpServletRequest request, Account.Models.User user) {
    javax.servlet.http.HttpSession session = request.getSession(true);
    session.setAttribute(session.getId(), user);
}