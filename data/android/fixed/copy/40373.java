private java.lang.String getListenerUser(domain.model.users.User user) {
    java.lang.String ret = null;
    ret = helpers.MD5.encrypt(user.getUsername());
    return ret;
}