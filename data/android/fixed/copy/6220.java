final boolean setLoggedUser(sk.tsystems.forum.entity.User user) {
    if (user != null) {
        setSessionObject(sk.tsystems.forum.servlets.ServletHelper.USER_SESSION_IDENT, user.getId());
        return true;
    }else {
        setSessionObject(sk.tsystems.forum.servlets.ServletHelper.USER_SESSION_IDENT, null);
        return false;
    }
}