public boolean isActiveAccount(java.lang.String username) {
    model.User user = getUser(username);
    return uDao.UserActivationStatus(user.getID());
}