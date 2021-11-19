public boolean usernameAlreadyExist(java.lang.String username) {
    if ((usr.getUser(username)) == null) {
        return false;
    }else {
        return true;
    }
}