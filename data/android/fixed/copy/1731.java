public boolean existsDatabaseSession() {
    boolean autenticado = sessionDAO.sessionExists(this);
    es.uji.commons.sso.User.log.info(("Authenticated is " + autenticado));
    return autenticado;
}