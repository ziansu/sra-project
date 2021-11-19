private void registerUserInHttpSession(javax.servlet.http.HttpServletRequest clientRequest, es.uji.commons.sso.User user) {
    javax.servlet.http.HttpSession serverSession = clientRequest.getSession();
    serverSession.setAttribute(User.SESSION_USER, user);
    es.uji.commons.sso.providers.SSOSessionProvider.log.info(("User registered in Http Session: " + (user.toString())));
}