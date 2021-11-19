final boolean setLoggedUser(sk.tsystems.forum.entity.User user) {
    setSessionObject(sk.tsystems.forum.servlets.ServletHelper.USER_SESSION_IDENT, user.getId());
    return true;
}