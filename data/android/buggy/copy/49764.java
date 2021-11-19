public void persistSession(java.lang.String domainCookieName) {
    sessionDAO.registerNewSession(this, domainCookieName);
    es.uji.commons.sso.User.log.info(("Persist session: " + domainCookieName));
}