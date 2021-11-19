private void registerUserInHttpSession(javax.servlet.http.HttpServletRequest clientRequest, es.uji.commons.sso.User user) {
    javax.servlet.http.HttpSession serverSession = clientRequest.getSession();
    serverSession.setAttribute(User.SESSION_USER, user);
}