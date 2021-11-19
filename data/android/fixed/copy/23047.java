public boolean usernameInUse(java.lang.String username) {
    if ((getUser(username)) == null) {
        return false;
    }else {
        return true;
    }
}